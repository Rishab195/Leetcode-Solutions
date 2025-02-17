class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int totalElements = m * n;
        k = k % totalElements; 

        int[] flatGrid = new int[totalElements];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                flatGrid[i * n + j] = grid[i][j];
            }
        }

        int[] newFlatGrid = new int[totalElements];
        for (int i = 0; i < totalElements; i++) {
            newFlatGrid[(i + k) % totalElements] = flatGrid[i];
        }
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(newFlatGrid[i * n + j]);
            }
            result.add(row);
        }

        return result;
    }
    }
