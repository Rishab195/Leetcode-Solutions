class Solution {
    public int mincostTickets(int[] days, int[] cost) {
        int dp[]=new int[days.length+1];
        Arrays.fill(dp,-1);
        int n=days.length;
        return SolveRec(days,cost,0,n,dp);

    }
    public int SolveRec(int[]days,int[]cost,int index,int n,int []dp){

        if(index>=n){
            return 0; 
        }
        if(dp[index]!=-1){
            return dp[index];
        }
        
        int option1=cost[0]+SolveRec(days,cost,index+1,n,dp);

        int  i;
        for(i=index;i<n && days[i]<days[index]+7;i++);
            int option2=cost[1]+SolveRec(days,cost,i,n,dp);
        
        for(i=index;i<n && days[i]<days[index]+30;i++);
            int option3=cost[2]+SolveRec(days,cost,i,n,dp);
        
        dp[index]= Math.min(option1,Math.min(option2,option3));
        return dp[index];
    }
}