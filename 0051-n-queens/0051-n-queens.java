class Solution {
    public List<List<String>> solveNQueens(int n) {
        // Initialize the board as a list of strings
        List<String> board = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            board.add(".".repeat(n)); // Initialize each row with n dots
        }

        List<List<String>> ans = new ArrayList<>(); // Initialize the answer list

        // Start solving the N-Queens problem
        nQueens(board, 0, n, ans);
        return ans;
    }

    // Check if placing a queen at (row, col) is safe
    public boolean isSafe(List<String> board, int row, int col, int n) {
        // Horizontal check
        for (int j = 0; j < n; j++) {
            if (board.get(row).charAt(j) == 'Q') {
                return false;
            }
        }
        // Vertical check
        for (int i = 0; i < n; i++) {
            if (board.get(i).charAt(col) == 'Q') {
                return false;
            }
        }
        // Left diagonal check
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board.get(i).charAt(j) == 'Q') {
                return false;
            }
        }
        // Right diagonal check
        for (int i = row, j = col; i >= 0 && j < n; i--, j++) {
            if (board.get(i).charAt(j) == 'Q') {
                return false;
            }
        }
        return true;
    }

    // Recursive function to solve N-Queens
    public void nQueens(List<String> board, int row, int n, List<List<String>> ans) {
        if (row == n) {
            // Add a copy of the board to the answer list
            ans.add(new ArrayList<>(board));
            return;
        }

        for (int j = 0; j < n; j++) {
            if (isSafe(board, row, j, n)) {
                // Place a queen at (row, j)
                StringBuilder sb = new StringBuilder(board.get(row));
                sb.setCharAt(j, 'Q');
                board.set(row, sb.toString());

                // Recur to place the rest of the queens
                nQueens(board, row + 1, n, ans);

                // Backtrack and remove the queen from (row, j)
                sb.setCharAt(j, '.');
                board.set(row, sb.toString());
            }
        }
    }
}
