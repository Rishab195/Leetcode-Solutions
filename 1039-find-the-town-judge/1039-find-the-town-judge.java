class Solution {
    public int findJudge(int n, int[][] trust) {
        int [] res=new int[n+1];
        int ans=-1;
        Arrays.fill(res,0);
        for(int[]l:trust){
            int u=l[0];
            int v=l[1];
            res[u]=-1;
            res[v]+=1;
        }
        for(int i=0;i<=n;i++){
            if(res[i]==n-1)
            {
                ans=i;
            }
        }
        return ans;        
    }
}