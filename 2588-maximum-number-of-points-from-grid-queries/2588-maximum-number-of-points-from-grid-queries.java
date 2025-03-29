class Pair{
    int value;
    int first;
    int second;
public Pair(int value,int first,int second){
    this.value=value;
    this.first=first;
    this.second=second;
}
}
class Solution {
    int[][]direction={{1,0},{-1,0},{0,1},{0,-1}};
    public int[] maxPoints(int[][] grid, int[] queries) {
        int len=queries.length;
        int n=grid.length;
        int m=grid[0].length;
        int []res=new int[len];
        Arrays.fill(res,0);
        ArrayList<Pair> sortedQ=new ArrayList<>();
        for(int i=0;i<len;i++){
            sortedQ.add(new Pair(queries[i],i,0));
        }
        Collections.sort(sortedQ, Comparator.comparingInt(p->p.value));

        PriorityQueue<Pair> pq=new PriorityQueue<>(Comparator.comparingInt(p->p.value));
        boolean[][]vis=new boolean[n][m];
        int points=0;
        pq.offer(new Pair(grid[0][0],0,0));
        vis[0][0]=true;

        for(Pair q: sortedQ){
            int queryVal=q.value;
            int indx=q.first;
            while(!pq.isEmpty() && pq.peek().value<queryVal){
                Pair top=pq.poll();
                int i=top.first;
                int j=top.second;
                points++;
                for(int[] dir :direction ){
                    int i_=i+dir[0];
                    int j_=j+dir[1];
                    if(i_>=0 && i_<n && j_<m && j_>=0 && !vis[i_][j_]){
                        pq.offer(new Pair(grid[i_][j_],i_,j_));
                        vis[i_][j_]=true;
                    }
                }
            }
            res[indx]=points;
        }
        return res;
    }
}