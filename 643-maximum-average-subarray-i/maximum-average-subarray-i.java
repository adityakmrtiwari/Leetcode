class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int left = 0;
        double sum = 0;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        double maxavg = sum / k;

        for (int right = k; right < n; right++) {
            sum = sum - nums[left++] + nums[right];
            maxavg = Math.max(maxavg, sum / k);
        }
        return maxavg;
    }
}

// Got TLE for last test cases .

// public double findMaxAverage(int[] nums, int k) {
//         int n = nums.length;
//         double maxavg = Double.NEGATIVE_INFINITY;
//         for (int i = 0; i <= n-k; i++) {
//             double sum =0;
//             for (int j = i; j < i + k; j++) {
//                 sum = sum + nums[j];
//             }
//             maxavg = Math.max(maxavg,sum/k);
//         }
//         return maxavg;
//     }