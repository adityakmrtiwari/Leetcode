class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        // Count of subarrays with exact sum = goal
        // = subarrays with sum ≤ goal - subarrays with sum ≤ goal - 1
        return atMost(nums, goal) - atMost(nums, goal - 1);
    }

    private int atMost(int[] nums, int goal) {
        if (goal < 0) return 0; // No subarray can have negative sum in binary array

        int left = 0, sum = 0, count = 0;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right]; // Expand window by including nums[right]

            // Shrink window if sum exceeds goal
            while (sum > goal) {
                sum -= nums[left];
                left++;
            }

            count += right - left + 1; // All subarrays ending at 'right' with valid sum
        }

        return count;

    }
}