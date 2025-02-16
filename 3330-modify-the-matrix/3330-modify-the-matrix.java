class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;

        for(int j=0;j<n;j++){
            int maxVal=Integer.MIN_VALUE;

            for(int i=0;i<m;i++){
                if(matrix[i][j]!=-1){
                    maxVal=Math.max(maxVal,matrix[i][j]);
                }
            }
            for(int i=0;i<m;i++){
                if(matrix[i][j]==-1){
                    matrix[i][j]=maxVal;
                }
            }
        }
        return matrix;
    }
}