class Solution {
    public int[] findOrder(int n, int[][] prerequisites) {
       ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
       for(int i=0;i<n;i++){
        adj.add(new ArrayList<>());
       }
       for(int[] i : prerequisites){
        int u=i[0];
        int v=i[1];
        adj.get(v).add(u);
       } 
       boolean[] vis=new boolean[n];
       boolean[] pathVis=new boolean[n];
       Arrays.fill(vis,false);
       Arrays.fill(pathVis,false);
       int [] res=new int[n];
       Stack<Integer> stk=new Stack<>();
       for(int i=0;i<n;i++){
        if(vis[i]==false){
           if(dfs(i,vis,pathVis,adj,stk)==false){
            return new int[0];
           }
        }
       }
       int k=0;
       while(!stk.isEmpty()){
        res[k++]=stk.pop();
       }
       return res;
    }
    public boolean dfs(int src, boolean []vis,boolean []pathVis,ArrayList<ArrayList<Integer>> adj,Stack<Integer> stk){
        vis[src]=true;
        pathVis[src]=true;
        for(int i: adj.get(src)){
            if(vis[i]==false){
                if(!dfs(i,vis,pathVis,adj,stk)){
                    return false;
                }
            }
            else if(pathVis[i]==true){
                return false;
            }
        }
        pathVis[src]=false;
        stk.push(src);
        return true;
    }

}