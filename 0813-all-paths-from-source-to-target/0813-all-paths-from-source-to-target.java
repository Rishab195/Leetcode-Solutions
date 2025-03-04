class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans=new ArrayList<>();
        findPath(0,graph,ans,new ArrayList<>());
        return ans;
    }

    private void findPath(int node,int[][]graph,List<List<Integer>> ans,List<Integer> curr){
        curr.add(node);
        if(node==graph.length-1){
            ans.add(new ArrayList<>(curr));
            curr.remove(curr.size()-1);
            return ;
        }
        for(int i: graph[node]){
            findPath(i,graph,ans,curr);
        }
        curr.remove(curr.size()-1);
    }
}