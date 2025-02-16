class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;

        for(int i=0;i<n;i++){
            sortDiagonal(mat,0,i,m,n);
        }
        for(int i=0;i<m;i++){
            sortDiagonal(mat,i,0,m,n);
        }
        return mat;
        
    }
    private void sortDiagonal(int[][]mat,int row,int col,int m,int n){
        List<Integer> list=new ArrayList<>();
        int i=row;
        int j=col;

        while(i<m && j<n){
            list.add(mat[i][j]);
            i++;
            j++;
        }
        Collections.sort(list);
        i=row;
        j=col;
        int index=0;
        while(i<m && j<n){
            mat[i][j]=list.get(index++);
            i++;
            j++;
        }
    }
}