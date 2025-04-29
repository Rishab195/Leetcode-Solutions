class Solution {
    public long countSubarrays(int[] nums, int k) {
        int n=nums.length;
        int left=0;
        long ans=0;
        int maxEle=nums[0];
        int count=0;
        for(int i=1;i<n;i++){
            if(nums[i]>maxEle){
                maxEle=nums[i];
            }
        }
        for(int right=0;right<n;right++){
           if(nums[right]==maxEle){
            count++;
           }
           while(count>=k){
                if(nums[left]==maxEle){
                    count--;
                }
                left++;
           }
        ans+=left;
        }
        return ans;
    }
}