class Solution {
    public long maximumTripletValue(int[] nums) {
        long ans=0;
        int n=nums.length;
        for(int a=0;a<n;a++){
             long  i=nums[a];
            for(int b=a+1;b<n;b++){
                long j=nums[b];
                for(int c=b+1;c<n;c++){
                    long k=nums[c];
                    long curr = (i-j)*k;
                    ans=Math.max(ans,curr);
                }
            }
        }
        return ans;
    }
}