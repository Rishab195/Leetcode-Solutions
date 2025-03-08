class Solution {
    public int numSquares(int n) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=1;i*i<=n;i++){
            arr.add(i*i);
        }
        int dp[][]=new int[arr.size()][n+1];
        for (int[] row : dp) Arrays.fill(row, -1);
        return SolveRec(n, arr,dp, 0);
    }
    public int SolveRec(int n,ArrayList<Integer>arr,int [][] dp,int index){
        if(n==0){
            return 0;
        }
        if(n<0 || index>=arr.size()){
            return Integer.MAX_VALUE-1;
        }
        if(dp[index][n]!=-1){
            return dp[index][n];
        }
        int take=Integer.MAX_VALUE;
        if(n>=arr.get(index))
         take=1+SolveRec(n-arr.get(index),arr,dp,index);
        int notTake=SolveRec(n,arr,dp,index+1);
        dp[index][n]=Math.min(take,notTake);
        return dp[index][n];
    }
}