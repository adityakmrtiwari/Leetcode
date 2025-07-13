class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return count(nums, k) - count(nums, k - 1);
    }

    private int count(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int oddCount = 0;
        int validSubArrays = 0;
        while (right < nums.length) {
            if (nums[right] % 2 != 0) {
                oddCount++;
            }
            while (oddCount > k) {
                if (nums[left] % 2 != 0) {
                    oddCount--;
                }
                left++;
            }
            validSubArrays += right - left + 1;
            right++;
        }
        return validSubArrays;
    }
}