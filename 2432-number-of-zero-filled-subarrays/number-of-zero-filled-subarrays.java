class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long totalZeroSubarrays = 0; // Total count of zero-filled subarrays
        long consecutiveZeros = 0; // Number of consecutive zeros ending at current index

        for (int num : nums) {
            if (num == 0) {
                consecutiveZeros++; // Extend streak of zeros
                totalZeroSubarrays += consecutiveZeros;
            } else {
                consecutiveZeros = 0; // Reset streak if non-zero
            }
        }
        return totalZeroSubarrays;
    }
}