class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        int i=0;
        int j=m-1;
        while(i<n && j>=0){
            int element=matrix[i][j];
            if(target==element){
                return true;
            }
            else if(target<element){
                j--;
            }
            else{
                i++;
            }
        }
        return false;
       
    }
}