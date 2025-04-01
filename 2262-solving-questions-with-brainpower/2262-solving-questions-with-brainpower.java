class Solution {
    public long mostPoints(int[][] questions) {
        int len=questions.length;
        int index=0;
        long [] dp=new long[len];
        Arrays.fill(dp,-1);
        return solveRec(index,questions,dp);
    }
    public long solveRec(int index,int[][]questions,long[]dp){
       
        if(index>=questions.length){
            return 0;
        }

         if(dp[index]!=-1){
            return dp[index];
        }
        
        //skip
        long skip=solveRec(index+1,questions,dp);

        //include
        long Solve=questions[index][0] + solveRec(index + questions[index][1]+1,questions,dp);

        dp[index]=Math.max(skip,Solve);
        return dp[index];

    }
}