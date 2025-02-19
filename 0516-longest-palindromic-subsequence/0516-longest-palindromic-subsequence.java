class Solution {
    public int longestPalindromeSubseq(String s) {
        StringBuilder s2=new StringBuilder(s);
        String s3 = s2.reverse().toString();
        int i=s.length()-1;
        int j=s3.length()-1;

        int dp[][]=new int[i+1][j+1];
        for(int k=0;k<=i;k++){
            for(int l=0;l<=j;l++){
                dp[k][l]=-1;
            }
        }
        return recur(i,j, s,s3,dp);
    }
    public int recur(int i,int j,String text1, String text2,int[][]dp)
    {
        if(i<0 || j<0){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int count=0;
        if(text1.charAt(i)==text2.charAt(j)){
            count=1+recur(i-1,j-1,text1,text2,dp);
        }
        else{
            count=Math.max(recur(i,j-1,text1,text2,dp) , recur(i-1,j,text1,text2,dp));
        }
        return dp[i][j]=count;
}
}