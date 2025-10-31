class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));
        int ct =0;
        long lastEndTime = Long.MIN_VALUE;

        for(int[] point : points){
            if(point[0]>lastEndTime) {
                ct++;
                lastEndTime = point[1];
            }
        }
        return ct;
    }
}