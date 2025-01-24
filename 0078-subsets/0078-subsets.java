class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> output=new ArrayList<>();

        int index=0;
        Solve(nums,output,index,ans);
        return ans;
    }
    public void Solve(int nums[],List<Integer>output,int index,List<List<Integer>> ans){
        if(index>=nums.length){
            ans.add(new ArrayList<>(output));
            return;
        }
        // exclude
        Solve(nums,output,index+1,ans);

        //include
        int element=nums[index];
        output.add(element);
        Solve(nums,output,index+1,ans);

        output.remove(output.size()-1);
    }
}