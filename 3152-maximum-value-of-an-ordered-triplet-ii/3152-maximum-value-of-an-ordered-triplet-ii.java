class Solution {
    public long maximumTripletValue(int[] nums) {
       int n=nums.length; 
       int[] prefixMax=new int[n];
       int [] suffixMax=new int[n];
       prefixMax[0]=nums[0];
       suffixMax[n-1]=nums[n-1];
       for(int i=1;i<n;i++){
        prefixMax[i]=Math.max(prefixMax[i-1],nums[i]);
       }
       for(int i=n-2;i>=0;i--){
        suffixMax[i]=Math.max(suffixMax[i+1],nums[i]);
       }
       long res=0;
       for(int j=1;j<n-1;j++){
        long leftMax=prefixMax[j-1];
        long rightMax=suffixMax[j+1];
        long curr=(leftMax-nums[j])*rightMax;
        res=Math.max(res,curr);
       }
       return res;
    }
}