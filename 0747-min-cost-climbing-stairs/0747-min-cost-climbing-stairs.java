class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int [] dp=new int[n+1];
        Arrays.fill(dp,-1);      
        return Math.min(SolveRec(cost,dp,0),SolveRec(cost,dp,1));
    }
    public int SolveRec(int[]cost,int[]dp,int index){
        int n=cost.length;
        if(index>=n){
            return 0;
        }
        if(dp[index]!=-1){
            return dp[index];
        }
        int skip1=cost[index]+SolveRec(cost,dp,index+1);
        int skip2=SolveRec(cost,dp,index+2)+cost[index];
        dp[index]=Math.min(skip1,skip2);
        return dp[index];
    }
}