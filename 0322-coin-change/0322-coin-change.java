class Solution {
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int[]dp=new int[amount+1];
        Arrays.fill(dp,-1);
        int result=SolveMem(coins,amount,dp);
        if(result!=Integer.MAX_VALUE){
            return result;
        }
        return -1;
    }
    public int SolveMem(int[]coins,int amount,int[]dp){

        if(amount==0){
            return 0;
        }
        if(amount<0){
            return Integer.MAX_VALUE;
        }
        if(dp[amount]!=-1){
            return dp[amount];
        }
        int minCoins=Integer.MAX_VALUE;
        for(int coin:coins){
            int ans=SolveMem(coins,amount-coin,dp);
            if(ans!=Integer.MAX_VALUE){
            minCoins=Math.min(minCoins,1+ans);
            }
        }
        dp[amount]=minCoins;
        return dp[amount];
    }
}