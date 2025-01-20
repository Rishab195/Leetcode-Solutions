class Solution {
    public int totalNQueens(int n) {
        List<String> board=new ArrayList<>();
        for(int i=0;i<n;i++){
            board.add(".".repeat(n));
        }
        return countWays(board,0,n);
    }
    public int countWays(List<String>board,int row,int n){
        if(row==n){
            return 1;
        }
        int answer=0;
        for(int j=0;j<n;j++){
            if(isSafe(board,row,j,n)){
                StringBuilder sb=new StringBuilder(board.get(row));
                sb.setCharAt(j,'Q');
                board.set(row,sb.toString());
                answer+=countWays(board,row+1,n);
                sb.setCharAt(j,'.');
                board.set(row,sb.toString());
            }
        }
        return answer;
    }
    public boolean isSafe(List<String> board,int row,int col,int n){
        for(int i=0;i<row;i++){
            if(board.get(i).charAt(col)=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=col-1;i>=0 && j>=0; i--,j--){
            if(board.get(i).charAt(j)=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=col+1;i>=0 && j<n;i--,j++){
            if(board.get(i).charAt(j)=='Q'){
                return false;
            }
        }
        return true;
    }

}