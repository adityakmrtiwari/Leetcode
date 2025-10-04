class Solution {
    public int maxArea(int[] height) {
        int lp = 0, rp = height.length - 1;
        int curArea = 0, maxArea = 0;
        while (lp < rp) {
            int w = rp - lp;
            int h = Math.min(height[lp], height[rp]);
            curArea = w * h;
            maxArea = Math.max(maxArea, curArea);
            if (height[lp] < height[rp])
                lp++;
            else
                rp--;
        }
        return maxArea;
    }
}