class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int low=0;
        int mid=0;
        int high=nums.length-1;
        int [] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                arr[low]=nums[i];
                low++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==pivot){
            arr[low++]=pivot;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>pivot){
                arr[low]=nums[i];
                low++;
            }
        }
        return arr;
    }
}