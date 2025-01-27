class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int[][] dp=new int[n+1][n+1];
        for (int i = 0; i <= n; i++) {
            Arrays.fill(dp[i], -1);
        }
        return solveMem(nums,0,-1,dp);
    }

    public int solveMem(int[]nums,int curr,int prev,int[][] dp){
        if(curr==nums.length){
            return 0;
        }
        if(dp[curr][prev+1]!=-1){
            return dp[curr][prev+1];
        }
        //include
        int take=0;
        if(prev==-1 || nums[curr]>nums[prev]){
            take=1+solveMem(nums,curr+1,curr,dp);
        }

        //exclude
        int notTake=0+solveMem(nums,curr+1,prev,dp);

        return dp[curr][prev+1]=Math.max(take,notTake);
    }
}