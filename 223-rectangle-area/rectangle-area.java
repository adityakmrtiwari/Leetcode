class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int areaA=Math.abs((ax2-ax1)*(ay2-ay1));
        int areaB= Math.abs((bx2-bx1)*(by2-by1));

        int overlapHeight = Math.max(0,Math.min(ay2,by2)-Math.max(ay1,by1));
        int overlapBreadth = Math.max(0,Math.min(ax2,bx2)-Math.max(bx1,ax1));

        int overlapArea = overlapHeight*overlapBreadth;
        return areaA+areaB-overlapArea;
    }
}