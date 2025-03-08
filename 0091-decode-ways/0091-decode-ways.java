class Solution {
    public int numDecodings(String s) {
        int n=s.length();
        int[]dp=new int[n+1];
        Arrays.fill(dp,-1);
        return SolveRec(0,s,dp);
    }
    public int SolveRec(int i, String s,int []dp){
        if(i==s.length()){
            return 1;
        }
        if(s.charAt(i)=='0') return 0;
        if(dp[i]!=-1){
            return dp[i];
        }

        int count=SolveRec(i+1,s,dp);
        if (i < s.length() - 1) {
            int num = Integer.parseInt(s.substring(i, i + 2));
            if (num >= 10 && num <= 26) {
                count += SolveRec(i + 2, s, dp);
            }
        }

        dp[i] = count;
        return count;
    }
}