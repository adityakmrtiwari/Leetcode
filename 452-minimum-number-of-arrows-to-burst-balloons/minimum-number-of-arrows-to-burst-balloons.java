class Solution {
    public int findMinArrowShots(int[][] points) {

        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));

        int arrow = 0;
        long lastRange = Long.MIN_VALUE;

        for (int[] arr : points) {
            if (arr[0] > lastRange) {
                arrow++;
                lastRange = arr[1];
            }
        }
        return arrow;
    }
}