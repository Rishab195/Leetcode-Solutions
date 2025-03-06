class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int res[]=new int[2];
        int sum=0;
        int actualSum=0;
        HashSet<Integer> set=new HashSet<>();
        int n=grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                sum+=grid[i][j];
                if(set.contains(grid[i][j])){
                    res[0]=grid[i][j];
                }
                set.add(grid[i][j]);
                
            }
        }
        for(int i=1;i<=n*n;i++){
            actualSum+=i;
        }
        res[1]=actualSum-(sum-res[0]);
        return res;
    }
}