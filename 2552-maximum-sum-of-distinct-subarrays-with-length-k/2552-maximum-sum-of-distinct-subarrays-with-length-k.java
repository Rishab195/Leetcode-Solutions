class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        
        HashSet<Integer> set=new HashSet<>();
        int left=0;
        long maxSum=0, sum=0;
        for(int i=0;i<nums.length;i++){
            while(set.contains(nums[i])){
                set.remove(nums[left]);
                sum-=nums[left];
                left++;
            }
            set.add(nums[i]);
            sum+=nums[i];

            if(i-left+1==k){
                maxSum=Math.max(maxSum,sum);
                set.remove(nums[left]);
                sum-=nums[left];
                left++;
            }
        }
        return maxSum;
    }
}