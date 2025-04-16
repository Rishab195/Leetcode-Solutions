class Solution {
    public int numIslands(char[][] board) {
        int count=0;
        int n=board.length;
        int m=board[0].length;
        int []delRow={-1,0,1,0};
        int []delCol={0,1,0,-1};
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]=='1'){
                    dfs(i,j,board,delRow,delCol);
                        count++;
                    }
                }
            }
        return count;
    }
    public void dfs(int row,int col,char[][]board,int[]delRow,int[]delCol){
        board[row][col]='V';
        int n=board.length;
        int m=board[0].length;
        for(int i=0;i<4;i++){
            int n_row=row+delRow[i];
            int n_col=col+delCol[i];
            if(n_row>=0 && n_row<n && n_col>=0 && n_col<m && board[n_row][n_col]=='1'){
                dfs(n_row,n_col,board,delRow,delCol);
            }
        }
    }
}