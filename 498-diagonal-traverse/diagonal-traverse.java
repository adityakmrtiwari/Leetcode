class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        int[] result = new int[m * n];
        int k = 0;

        for (int d = 0; d < m + n - 1; d++) {
            // Temporary list to hold elements of current diagonal
            List<Integer> diagonal = new ArrayList<>();

            int row = (d < n) ? 0 : d - n + 1;
            int col = (d < n) ? d : n - 1;

            // Collect elements in the diagonal
            while (row < m && col >= 0) {
                diagonal.add(mat[row][col]);
                row++;
                col--;
            }

            // If diagonal is even, reverse before adding
            if (d % 2 == 0) {
                Collections.reverse(diagonal);
            }

            for (int val : diagonal) {
                result[k++] = val;
            }
        }

        return result;
    }
}
