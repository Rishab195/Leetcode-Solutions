class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        return BinarySearch(nums,0,n-1,target);
    }
    public int BinarySearch(int[]nums, int s,int e,int target){
        if(s>e){
            return -1;
        }
        int mid=s+(e-s)/2;
        if(nums[mid]==target){
            return mid;
        }
        if(nums[mid]>target){
           return BinarySearch(nums,s,mid-1,target);
        }
        else{
            return BinarySearch(nums,mid+1,e,target);
        }
    }
}