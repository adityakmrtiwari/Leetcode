class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int r = image.length;
        int c = image[0].length;

        int[][] ans = new int [r][c];

        for(int i=0;i<r;i++){
            int x = c-1;
            for(int j=0;j<c/2;j++){ 
                int temp=image[i][j];
                image[i][j]=image[i][x];
                image[i][x]=temp;
                x--;
            }
        }

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(image[i][j]==0)
                    ans[i][j]=1;
                else
                    ans[i][j]=0;
            }
        }
        return ans;
    }
}