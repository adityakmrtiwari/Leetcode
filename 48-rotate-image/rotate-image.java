class Solution {
    public void rotate(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;

        int[][] transpose = new int [r][c];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                transpose[j][i]= matrix[i][j];
            }
        }

        

        for(int i=0;i<c;i++){
            int x = r-1;
            for(int j=0;j<r/2;j++){
                int temp = transpose[i][j];
                transpose[i][j]= transpose[i][x];
                transpose[i][x]= temp;
                x--;
            }
        }

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]= transpose[i][j];
            }
        }

        
    }
}