class Solution {
    public int minInsertions(String s) {
        int i=s.length()-1;
        StringBuilder s1=new StringBuilder(s);
        String str=s1.reverse().toString();
        int dp[][]=new int[i+1][i+1];
        for(int k=0;k<=i;k++){
            for(int l=0;l<=i;l++){
                dp[k][l]=-1;
            }
        }
        int len= recur(i,i, s,str,dp);
        int ans=s.length()-len;
        return ans;
    }
    // public int recur(String s,String s1){
    //     int m=s.length()-1;
    //     int n=s1.length()-1;
    //     int [][]dp=new int[m+1][n+1];

    //     for(int i=m;i>=0;i--){
    //         for(int j=n;j>=0;j--){
    //             if(s.charAt(i)==s1.charAt(j)){
    //                 dp[i][j]=1+dp[i-1][j-1];
    //             }else{
    //                 dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
    //             }
    //         }
    //     }
    //     return dp[i][j];
    // }
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