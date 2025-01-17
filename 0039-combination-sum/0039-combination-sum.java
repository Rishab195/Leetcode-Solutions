class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        SolveRec(candidates,target,0,new ArrayList<>(),result);
        return result;
    }
    public void SolveRec(int[] candidates,int target,int start,List<Integer>current,List<List<Integer>> result)
    {
        if(target==0){
            result.add(new ArrayList<>(current));
            return;
        }
        for(int i=start;i<candidates.length;i++){
            int rem=target-candidates[i];
            if(rem>=0){
                current.add(candidates[i]);
                SolveRec(candidates,rem,i,current,result);
                current.remove(current.size()-1);
            }
        }
    }
}