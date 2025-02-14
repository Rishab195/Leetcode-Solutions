class Solution {
    public int rob(int[] nums) {
       int n=nums.length;
       int[]dp=new int[n+1];
       Arrays.fill(dp,-1);
        return solveRec(0,nums,dp);
    }
    public int solveRec(int n,int[]nums,int[]dp){

        if(n>=nums.length){
            return 0;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int ans=0;
        int robthisHouse=nums[n]+solveRec(n+2,nums,dp);
        int skipthisHouse=solveRec(n+1,nums,dp);

        dp[n]=Math.max(robthisHouse,skipthisHouse);

        return dp[n];
    }
}