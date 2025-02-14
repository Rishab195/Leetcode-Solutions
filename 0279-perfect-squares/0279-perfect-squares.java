class Solution {
    public int numSquares(int n) {
        int []dp=new int[n+1];
        Arrays.fill(dp,-1);
        return SolveRec(n,dp);
    }
    public int SolveRec(int n, int[]dp){
        if(n==0){
            return 0;
        }
        if(n<0){
            return Integer.MAX_VALUE;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int answer=Integer.MAX_VALUE;
        for(int i=1;i*i<=n;i++){
            answer=Math.min(answer,1+SolveRec(n-(i*i),dp));
        }
        return dp[n]=answer;
    }
}