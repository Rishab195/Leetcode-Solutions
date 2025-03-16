class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> subList=new ArrayList<>();
        recursion(nums,res,subList);
        return res;
    }
    public void recursion (int[]nums ,List<List<Integer>> res,List<Integer> subList){

        if(subList.size()==nums.length){
            res.add(new ArrayList<>(subList));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(subList.contains(nums[i])){
                continue;
            }
            subList.add(nums[i]);
            recursion(nums,res,subList);
            subList.remove(subList.size()-1);
        }
    }
}