class Solution {
    public int longestPalindromeSubseq(String s) {
        if(s==null){
            return 0;
        }
        int n=s.length();
        String str=new StringBuilder(s).reverse().toString();

        int[][]dp=new int[n+1][n+1];
        for(int i=n-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                if(s.charAt(i)==str.charAt(j)){
                    dp[i][j]=1+dp[i+1][j+1];
                }
                else{
                    dp[i][j]=Math.max(dp[i+1][j],dp[i][j+1]);
                }
            }
        }
        return dp[0][0];
    }
}