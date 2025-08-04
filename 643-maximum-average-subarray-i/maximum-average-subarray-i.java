class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left = 0;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        double maxAverage = (double) sum / k;

        for (int i = k; i < nums.length; i++) {
            sum = sum - nums[left] + nums[i];
            left++;
            maxAverage = Math.max(maxAverage, (double) sum / k);
        }
        return maxAverage;
    }
}