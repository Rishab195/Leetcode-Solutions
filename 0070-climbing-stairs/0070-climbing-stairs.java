class Solution {
    public int climbStairs(int n) {
      int[]dp=new int[n+1];
      Arrays.fill(dp,-1);
      return SolveRec(n ,dp,0);  
    }
    public int SolveRec(int n,int[]dp,int index){
        if(n==index){
            return 1;
        }
        if(index>=n){
            return 0;
        }
        if(dp[index]!=-1){
            return dp[index];
        }

        dp[index]=SolveRec(n,dp,index+1)+SolveRec(n,dp,index+2);
        return dp[index];
    }
}