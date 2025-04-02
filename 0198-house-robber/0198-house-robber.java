class Solution {
    public int rob(int[] nums) {
        int dp[]=new int[nums.length+1];
        Arrays.fill(dp,-1);
        return solveRec(0,nums,dp);
    }
    public int solveRec(int index,int[]nums,int[]dp){
        int n=nums.length;
        if(index>=n){
            return 0;
        }
        if(dp[index]!=-1){
            return dp[index];
        }

        //skip
        int skip=solveRec(index+1,nums,dp);

        //take
        int take=nums[index]+solveRec(index+2,nums,dp);

        dp[index]= Math.max(skip,take);
        return dp[index];
    }
}