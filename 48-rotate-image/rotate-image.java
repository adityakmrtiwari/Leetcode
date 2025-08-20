class Solution {
    public void rotate(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;

        for (int i = 0; i < r; i++) {
            for (int j = i + 1; j < r; j++) {
                int remp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = remp;
            }
        }

        for (int i = 0; i < c; i++) {
            int x = r - 1;
            for (int j = 0; j < r / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][x];
                matrix[i][x] = temp;
                x--;
            }
        }

    }
}