class Pair{
    int first;
    int second;
    public Pair(int first,int second){
        this.first=first;
        this.second=second;
    }
}

class Solution {
    public boolean possibleBipartition(int n, int[][] dislikes) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }
        for(int [] i: dislikes){
            int u=i[0];
            int v=i[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        int[] color=new int[n+1];
        Arrays.fill(color,-1);
        for(int i=0;i<=n;i++){
            if(color[i]==-1){
                if(bfs(i,0,color,adj)==false){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean bfs(int src,int colorGiven,int []color,ArrayList<ArrayList<Integer>> adj){
        color[src]=colorGiven;
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(src,colorGiven));
        while(!q.isEmpty()){
            int node=q.peek().first;
            int nodecol=q.peek().second;
            q.poll();
            for(int nbr: adj.get(node)){
                if(color[nbr]==-1){
                    color[nbr]=1-nodecol;
                    q.add(new Pair(nbr,color[nbr]));
                }
                else if(color[nbr]==color[node]){
                    return false;
                }
            }
        }
        return true;
    }
}