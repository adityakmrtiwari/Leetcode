class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        int[] res = new int[2];

        int ct = 0;

        for (int i = 0; i < m; i++) {
            ct =0;
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1) {
                    ct++;
                }
            }
            if(ct>res[1]){
                res[0]=i;
                res[1]=ct;
            }
        }

        return res;
    }
}