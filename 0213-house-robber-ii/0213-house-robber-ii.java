class Solution {
    public int rob(int[] nums) {
        int dp[]=new int[nums.length+1];
        Arrays.fill(dp,-1);
        int dp1[]=new int[nums.length+1];
        Arrays.fill(dp1,-1);
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
        return Math.max(solveRec(0,nums,dp,n-1),solveRec(1,nums,dp1,n)) ;
    }
    public int solveRec(int index,int[]nums,int[]dp,int n){
        if(index>=n){
            return 0;
        }
        if(dp[index]!=-1){
            return dp[index];
        }
        
        //skip
        int skip=solveRec(index+1,nums,dp,n);

        //take
        int take=nums[index]+solveRec(index+2,nums,dp,n);

        dp[index]= Math.max(skip,take);
        return dp[index];
    }
}