class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> subList=new ArrayList<>();
        recursion(0,nums,res,subList);
        return res;
    }
    public void recursion (int index,int[]nums ,List<List<Integer>> res,List<Integer> subList){
        if(index==nums.length){
            res.add(new ArrayList<>(subList));
            return;
        }
        int n=nums.length;
        for(int j=index;j<n;j++){
            swap(nums,index,j);
            subList.add(nums[index]);
            recursion(index+1,nums,res,subList);
            subList.remove(subList.size()-1);
            swap(nums,index,j);
        }
    }
    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}