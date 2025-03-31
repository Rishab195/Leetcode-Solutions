class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char num = board[i][j];
                if(num!='.' && !isSafe(board,i,j,num)){
                return false;
                }
            }  
        }
         return true;

    }
    public boolean isSafe(char[][]board,int row,int col,char number){
        // row check
        for(int i=0;i<board.length;i++){
            if(i!=row && board[i][col]==number){
                return false;
            }
        }
        //col check
        for(int i=0;i<board.length;i++){
            if(i!=col && board[row][i]==number){
                return false;
            }
        }
        //grid check
        int sr=(row/3)*3;
        int sc=(col/3)*3;
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if((i!=row || j!=col) && board[i][j]==number){
                    return false;
                }
            }
        }
        return true;
    }
}