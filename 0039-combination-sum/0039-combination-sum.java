class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> output=new ArrayList<>();
        int index=0;
        int sum=0;
        SolveRec(index,sum,output,ans,candidates,target);
        return ans;
    }
    public void SolveRec(int index,int sum,List<Integer> output,List<List<Integer>> ans,int[] candidates,int target){
        if(index>=candidates.length && sum==target){
            ans.add(new ArrayList<>(output));
            return;
        }
        if(index>=candidates.length && sum!=target){
            return;
        }
        if(sum>target){
            return;
        }
        //exclude
        SolveRec(index+1,sum,output,ans,candidates,target);

        //include
        output.add(candidates[index]);
        SolveRec(index,sum+candidates[index],output,ans,candidates,target);

        //backtrack
        output.remove(output.size()-1);
    }
}