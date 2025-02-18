class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] res=new int[2];
        int m=mat.length;
        int n=mat[0].length;
        int minRow=-1;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<m;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(mat[i][j]==1){
                    count+=1;
                }
                if(count>ans){
                    ans=count;
                    minRow=i;
                }
                else if(count==ans && i<minRow){
                    minRow=i;
                }
            }
        }
        res[0]=minRow;
        res[1]=ans;
        return res;
    }
}