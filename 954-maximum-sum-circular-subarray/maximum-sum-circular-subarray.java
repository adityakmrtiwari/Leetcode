class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;

        int currMaxSum = nums[0] , maxSum = nums[0];

        int currMinSum = nums[0] , minSum = nums[0];

        int totalSum = nums[0];

        for (int i = 1; i < n; i++) {
            totalSum += nums[i];

            currMaxSum = Math.max(nums[i], currMaxSum + nums[i]);
            maxSum = Math.max(currMaxSum, maxSum);

            currMinSum = Math.min(nums[i], currMinSum + nums[i]);
            minSum = Math.min(currMinSum, minSum);
        }
        if (maxSum < 0) return maxSum;
        return Math.max(maxSum, totalSum - minSum);
    }
}