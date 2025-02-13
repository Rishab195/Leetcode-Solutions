class Solution {
    public int climbStairs(int n) {
        int[]dp=new int[n+1];
        Arrays.fill(dp,-1);
        return recur(n,dp);
    }
    public int recur(int i,int []dp){
        if(i==0){
            return 1;
        }
        if(i<0){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        dp[i]=recur(i-1,dp)+recur(i-2,dp);
        return dp[i];
    }
}