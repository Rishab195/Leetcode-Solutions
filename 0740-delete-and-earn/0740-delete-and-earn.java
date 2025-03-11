class Solution {
    public int deleteAndEarn(int[] nums) {
       int n=nums.length;
       Arrays.sort(nums);
       int maxi=nums[n-1]+1;
       int[]dp=new int[maxi];
       Arrays.fill(dp,-1);
       int[]arr=new int[maxi];
       Arrays.fill(arr,0);
       for(int i=0;i<n;i++){
        arr[nums[i]]+=nums[i];
       }
       return solveRec(arr,0,dp);
    }
    public int solveRec(int[]arr,int index,int []dp){
        if(index>=arr.length){
            return 0;
        }
        if(dp[index]!=-1){
            return dp[index];
        }
        int take=arr[index]+solveRec(arr,index+2,dp);
        int notTake=solveRec(arr,index+1,dp);
        dp[index]=Math.max(take,notTake);
        return dp[index];
    }
}