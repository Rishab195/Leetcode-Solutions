class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        if (sum % 2 != 0) return false;
        sum=sum/2;
        int[][]dp=new int[nums.length+1][sum+1];
        for(int i=0;i<=nums.length;i++){
            for(int j=0;j<=sum;j++){
                dp[i][j]=-1;
            }
        }
        return func(0,nums,sum,dp);

    }
    public boolean func(int i,int[]arr,int sum,int[][]dp){
        int n=arr.length;
        if(sum==0){
            return true;
        }
        if(i==n) return false;
        if(dp[i][sum]!=-1){
            return dp[i][sum]==1;
        }
        boolean pick=false;
        if(sum>=arr[i]){
            pick=func(i+1,arr,sum-arr[i],dp);
        }
        boolean skip=func(i+1,arr,sum,dp);
        dp[i][sum] = (pick || skip) ? 1 : 0;
        return skip || pick;
        
        
    }
}