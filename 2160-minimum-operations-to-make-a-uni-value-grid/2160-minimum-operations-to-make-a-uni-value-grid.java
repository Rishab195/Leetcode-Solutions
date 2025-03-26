class Solution {
    public int minOperations(int[][] grid, int x) {
        int n=grid.length;
        int m=grid[0].length;
        int count=0;
        int[]arr=new int[n*m];
        int k=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[k]=grid[i][j];
                k++;
            }
        }
        Arrays.sort(arr);
        int mid=arr[k/2];
        for(int i=0;i<n*m;i++){
            int diff=(arr[i]-mid);
            if(diff%x!=0){
                return -1;
            }
            count+=Math.abs(arr[i]-mid)/x;

        }
        return count;
        
    }
}