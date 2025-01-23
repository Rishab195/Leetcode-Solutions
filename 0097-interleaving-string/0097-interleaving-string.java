class Solution {
        String S1,S2,S3;
        int[][]dp = new int[101][101];
        public int rec(int i,int j){
            // dp=new int[101][101];
            if(i==S1.length() && j==S2.length()){
                return 1;
            }
        
        if(dp[i][j]!=-1){
            return dp[i][j];
        }

            int option1=0;
            if(i<S1.length() && S1.charAt(i)==S3.charAt(i+j)){
                option1=rec(i+1,j);
            }
            int option2=0;
            if(j<S2.length() && S2.charAt(j)==S3.charAt(i+j)){
                option2=rec(i,j+1);
            }
            int answer=option1 | option2;
            dp[i][j]=answer;
            return answer;
        }
    public boolean isInterleave(String s1, String s2, String s3) {
        S1=s1;
        S2=s2;
        S3=s3;
        if(s1.length()+s2.length()!=s3.length()){
            return false;
        }
        for (int[] row : dp) {
            java.util.Arrays.fill(row, -1);
        }
        return rec(0,0)==1;

    }
}