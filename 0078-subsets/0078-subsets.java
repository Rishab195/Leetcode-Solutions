class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> output=new ArrayList<>();
        int index=0;
        SolveRec(index,nums,ans,output);
        return ans;
    }
    public void SolveRec(int index,int[]nums,List<List<Integer>>ans,List<Integer> output){
        if(index>=nums.length){
                ans.add(new ArrayList<>(output));
                return;
            }

        //exclude
        SolveRec(index+1,nums,ans,output);

        //include
        output.add(nums[index]);
        SolveRec(index+1,nums,ans,output);

        //backtrack
        output.remove(output.size()-1);
    }
}