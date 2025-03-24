class Solution {
    public int nodeCount;
    public int edgeCount;

    public void dfs(int curr,List<List<Integer>> adj,boolean[]vis){
        nodeCount++;
        vis[curr]=true;
        for(int nbr : adj.get(curr)){
            edgeCount++;
            if(vis[nbr]==false){
                dfs(nbr,adj,vis);
            }
        }
    }

    public int countCompleteComponents(int n, int[][] edges) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int []edge : edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        boolean[]vis=new boolean[n];
        int count=0;
        for(int i=0;i<n;i++){
            if(!vis[i]){
                nodeCount=0;
                edgeCount=0;
                dfs(i,adj,vis);
                if(edgeCount==nodeCount*(nodeCount-1)){
                    count++;
                }
            }
        }
        return count;
    }
    
}