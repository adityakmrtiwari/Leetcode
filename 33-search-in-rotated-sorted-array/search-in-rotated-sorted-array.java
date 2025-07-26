class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Target found
            if (nums[mid] == target)
                return mid;

            // Left half is sorted
            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid])
                    // Target is in left half   
                    right = mid - 1;
                else
                    left = mid + 1;
            }

            // Right half is sorted
            else {
                if (nums[mid] < target && target <= nums[right])
                    // Target is in right half
                    left = mid + 1;
                else
                    // Target is in left half
                    right = mid - 1;
            }
        }
        return -1;
    }
}