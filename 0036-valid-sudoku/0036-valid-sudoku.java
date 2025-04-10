class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n=board.length;
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char num=board[i][j];
                if(num!='.' && !isSafe(board,i,j,num)){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isSafe(char[][]board,int row,int col,char number){

        for(int i=0;i<9;i++){
            if(i!=row && board[i][col]==number){
                return false;
            }
        }
        for(int j=0;j<9;j++){
            if(j!=col && board[row][j]==number){
                return false;
            }
        }

        int sr=(row/3)*3;
        int sc=(col/3)*3;
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if((i != row || j != col) && board[i][j]==number){
                    return false;
                }
            }
        }
        return true;
    }
}