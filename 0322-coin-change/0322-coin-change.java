class Solution {
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int[][]dp=new int[n][amount+1];
        for(int[] row: dp){    
        Arrays.fill(row,-1);
        }
        int res=SolveRec(coins,amount,0,n,dp);
        if(res==Integer.MAX_VALUE-1){
            return -1;
        }
        return res;
    }
    public int SolveRec(int[]coins,int amount,int index,int n,int[][]dp){
        if(index>=n){
            return Integer.MAX_VALUE-1;
        }
        if(amount==0){
            return 0;
        }
        if(dp[index][amount]!=-1){
            return dp[index][amount];
        }
        int take=Integer.MAX_VALUE-1;
        if(coins[index]<=amount){
            take=1+SolveRec(coins,amount-coins[index],index,n,dp);
        }

        int notTake=SolveRec(coins,amount,index+1,n,dp);

        return dp[index][amount]= Math.min(take,notTake);
        
    }
}