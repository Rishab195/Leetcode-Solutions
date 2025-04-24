class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][]dp=new int[m][n];
        for(int[]row: dp){
            Arrays.fill(row,-1);
        }
        return solveRec(0,0,m,n,grid,dp);
    }
    public int solveRec(int i,int j, int m,int n,int[][]grid,int[][]dp){
        if(i>=m || j>=n || grid[i][j]==1)  return 0;
        if(i==m-1 && j==n-1) return 1;
        if(dp[i][j]!=-1) return dp[i][j];

        // if(grid[i][j]==0){
            int right=solveRec(i,j+1,m,n,grid,dp);
            int down=solveRec(i+1,j,m,n,grid,dp);
            return dp[i][j]= right+down;
        // }


    }

}