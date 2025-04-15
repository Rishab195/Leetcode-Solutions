class Solution {
    int count = 0;

    public int islandPerimeter(int[][] grid) {
        int[] delRow = {-1, 0, 1, 0};
        int[] delCol = {0, 1, 0, -1};

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    dfs(i, j, grid, delRow, delCol);
                    return count; // Perimeter will be counted in this DFS
                }
            }
        }
        return 0;
    }

    public void dfs(int row, int col, int[][] grid, int[] delRow, int[] delCol) {
        int n = grid.length;
        int m = grid[0].length;

        grid[row][col] = 2; // mark visited

        for (int i = 0; i < 4; i++) {
            int nrow = row + delRow[i];
            int ncol = col + delCol[i];

            // Check if the neighbor is water or out of bounds
            if (nrow < 0 || nrow >= n || ncol < 0 || ncol >= m || grid[nrow][ncol] == 0) {
                count++;
            } else if (grid[nrow][ncol] == 1) {
                dfs(nrow, ncol, grid, delRow, delCol);
            }
        }
    }
}
