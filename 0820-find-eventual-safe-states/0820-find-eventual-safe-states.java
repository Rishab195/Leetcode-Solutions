class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n=graph.length;
        boolean [] vis = new boolean[n];
        Arrays.fill(vis,false);
        boolean[] pathVis = new boolean [n];
        Arrays.fill(pathVis,false);
        for(int i=0;i<n;i++){
            if(vis[i]==false){
                dfs(i,vis,pathVis,graph);
            }
        }
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(pathVis[i]==false){
                res.add(i);
            }
        }
        return res;
    }

    public boolean dfs(int src,boolean[]vis ,boolean[] pathVis,int[][]graph){
        vis[src]=true;
        pathVis[src]=true;
        for(int nbr: graph[src]){
            if(vis[nbr]==false){
                if(dfs(nbr,vis,pathVis,graph)){
                    return true;
                }
            }
            else if(pathVis[nbr]==true){
                return true;
            }
        }
        pathVis[src]=false;
        return false;
    }
}