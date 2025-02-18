class Solution {
    public int maxSubArray(int[] nums) {
        int result=nums[0];
        int maxSum=nums[0];
        for(int i=1;i<nums.length;i++){
            maxSum=Math.max(maxSum+nums[i],nums[i]);
            result=Math.max(result,maxSum);
        }
        return result;

    }
}