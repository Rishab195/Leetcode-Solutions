class Solution {
    public int[][] diagonalSort(int[][] mat) {
       int m=mat.length;
       int n=mat[0].length;
       for(int i=0;i<n;i++){
        sortMatrix(0,i,m,n,mat);
       } 
       for(int i=1;i<m;i++){
        sortMatrix(i,0,m,n,mat);
       }
        return mat;
    }
    public int[][] sortMatrix(int row,int col,int m,int n,int[][]mat){
        ArrayList<Integer> list=new ArrayList<>();
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
        return mat;
    }
}