class Solution {
    public long coloredCells(int n) {
        if(n==1){
            return 1;
        }
        long[]dp=new long[n+1];
        Arrays.fill(dp,-1);
        dp[1]=1;
        return rec(n,dp);
    }
    public long rec(int i,long[]dp){
        dp[1]=1;
        if(dp[i]!=-1){
            return dp[i];
        }
        dp[i]= rec(i-1,dp) + 4*(i-1);
        return dp[i];
    }
}