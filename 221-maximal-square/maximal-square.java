class Solution {
    public int maximalSquare(char[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m + 1][n + 1];
        int maxSide = 0;
        
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (matrix[i - 1][j - 1] == '1') {
                    dp[i][j] = Math.min(
                        Math.min(dp[i - 1][j], dp[i][j - 1]),
                        dp[i - 1][j - 1]
                    ) + 1;
                    maxSide = Math.max(maxSide, dp[i][j]);
                }
            }
        }
        
        return maxSide * maxSide;
    }
}


// class Solution {
//     public int maximalSquare(char[][] matrix) {
//         if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
//             return 0;
//         }

//         int m = matrix.length;
//         int n = matrix[0].length;
//         int maxSide = 0;

//         // Try every top-left corner
//         for (int i = 0; i < m; i++) {
//             for (int j = 0; j < n; j++) {
//                 if (matrix[i][j] == '1') {
//                     // possible side lengths starting from 1
//                     for (int len = 1; i + len <= m && j + len <= n; len++) {
//                         if (isSquareAllOnes(matrix, i, j, len)) {
//                             maxSide = Math.max(maxSide, len);
//                         } else {
//                             break; // no need to try larger squares
//                         }
//                     }
//                 }
//             }
//         }
//         return maxSide * maxSide;
//     }

//     // helper to check if sub-square of size len starting at (row, col) is all '1's
//     private boolean isSquareAllOnes(char[][] matrix, int row, int col, int len) {
//         for (int i = row; i < row + len; i++) {
//             for (int j = col; j < col + len; j++) {
//                 if (matrix[i][j] == '0') {
//                     return false;
//                 }
//             }
//         }
//         return true;
//     }
    
// }