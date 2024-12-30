class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int ans=0, min_diff=Integer.MAX_VALUE, n=nums.length;
        for(int i=0;i<n-2;i++){
            int sum=0, j=i+1;int k=n-1;
            Arrays.sort(nums);
            while(j<k){
                 sum=nums[i]+nums[j]+nums[k];
                if(sum==target){
                    return sum;
                }
                else if(sum>target){
                    k--;
                }
                else{
                    j++;
                }
                if(Math.abs(sum-target)<min_diff){
                    min_diff=Math.abs(sum-target);
                    ans=sum;
                }
            }

        }
        return ans;
    }
}