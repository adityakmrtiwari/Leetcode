class Solution {
    public int singleNonDuplicate(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // Ensure mid is even for correct pairing
            if (mid % 2 == 1)
                mid--;

            if (nums[mid] == nums[mid + 1]) {
                // Move to the right half
                left = mid + 2;
            } else {
                // Move to the left half (including mid)
                right = mid;
            }
        }

        // left == right, pointing to the single element
        return nums[left];
    }
}
