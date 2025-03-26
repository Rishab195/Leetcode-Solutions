class Solution {
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
        int color[]=new int[n];
        Arrays.fill(color,-1);
        for(int i=0;i<n;i++){
            if(color[i]==-1){
                if(fillColor(i,color,graph)==false){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean fillColor(int src,int[]color,int[][]graph){
        Queue<Integer> q=new LinkedList<>();
        q.add(src);
        color[src]=0;
        while(!q.isEmpty()){
            int node=q.peek();
            q.poll();
        for(int i: graph[node]){
            if(color[i]==-1){
                color[i]=1-color[node];
                q.add(i);
            }
            if(color[node]==color[i]){
                return false;
            }
        }
    }
        return true;
    }
}