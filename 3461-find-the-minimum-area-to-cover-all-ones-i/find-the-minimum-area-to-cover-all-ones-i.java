class Solution {
    public int minimumArea(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;

        int maxr=-1,minr=r;
        int maxc=0,minc=c;

        for(int i =0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==1){
                    if(i<minr) minr=i;
                    if(i>maxr) maxr=i;
                    if(j>maxc) maxc=j;
                    if(j<minc) minc=j;
                }
            }
        }
        if (maxr == -1) return 0;
        return (maxr-minr+1)*(maxc-minc+1);
    }
}