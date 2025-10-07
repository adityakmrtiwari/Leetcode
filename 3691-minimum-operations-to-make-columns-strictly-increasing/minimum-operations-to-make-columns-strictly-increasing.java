class Solution {
    public int minimumOperations(int[][] grid) {
        int op = 0;
        for (int i = 1; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i - 1][j] >= grid[i][j]) {
                    op += (grid[i - 1][j] + 1) - grid[i][j];
                    grid[i][j]= grid[i-1][j]+1;
                }
            }
        }
        return op;
    }
}