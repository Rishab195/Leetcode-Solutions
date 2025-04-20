class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        if(text1==null || text2==null){
            return 0;
        }
        int m=text1.length();
        int n=text2.length();
        int[][]dp=new int[m+1][n+1];
        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                if(text1.charAt(i)==text2.charAt(j)){
                    dp[i][j]=1+dp[i+1][j+1];
                }else{
                    dp[i][j]=Math.max(dp[i][j+1],dp[i+1][j]);
                }
            }
        }
        return dp[0][0];
    }
}