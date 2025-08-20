class Solution {
    public int countSquares(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;

        int sum = 0;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (matrix[i][j] == 1) {
                    for (int len = 1; i + len <= r && j + len <= c; len++) {
                        if (square(matrix, i, j, len)) {
                            sum += 1;

                        } else {
                            break;
                        }
                    }
                }
            }
        }
        return sum;
    }

    public boolean square(int[][] matrix, int row, int col, int len) {
        for (int a = row; a < row + len; a++) {
            for (int b = col; b < col + len; b++) {
                if (matrix[a][b] == 0)
                    return false;
            }
        }
        return true;
    }
}