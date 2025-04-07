class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> output=new ArrayList<>();
        int index=0;
        SolveRec(index,output,ans,nums);
        return ans;
    }
    public void SolveRec(int index,List<Integer> output,List<List<Integer>> ans,int[]nums){
        if(index>=nums.length){
            ans.add(new ArrayList<>(output));
            return;
        }
        //Exclude
        SolveRec(index+1,output,ans,nums);
        
        //Include
        output.add(nums[index]);
        SolveRec(index+1,output,ans,nums);


        //backtrack
        output.remove(output.size()-1);
    }
}