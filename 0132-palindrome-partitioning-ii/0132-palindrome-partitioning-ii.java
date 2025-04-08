class Solution {
     public boolean isPalindrome(String s,int i,int j){
        while(i<j){
        if(s.charAt(i)!=s.charAt(j)){
            return false;
        }
        i++;
        j--;
        }
        return true;
    }
    public int minCut(String s) {
        int n=s.length();
        int [] dp=new int[n];
        Arrays.fill(dp,-1);
        return SolveRec(0,s,dp)-1;
    }
    public int SolveRec(int i,String s,int[]dp){
        if(i==s.length()){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int minCut=Integer.MAX_VALUE;
        for(int j=i;j<s.length();j++){
            if(isPalindrome(s,i,j)){
                int cut=1+SolveRec(j+1,s,dp);
                minCut=Math.min(minCut,cut);
            }
        }
        return dp[i]=minCut;
    }
}