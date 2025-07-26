class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        int r = nums.length - 1;
        int l = 0;
        if (n == 1)
            return 0;
        else if (nums[1] < nums[0])
            return 0;
        else if (nums[n-1] > nums[n-2])
            return n - 1;
        return helper(nums, l, r);
    }

    private int helper(int[] nums, int l, int r) {
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if ((nums[mid] > nums[mid + 1]) && (nums[mid] > nums[mid - 1]))
                return mid;
            else if (nums[mid] < nums[mid + 1]) {
                l = mid + 1;
                helper(nums, l, r);
            } else if (nums[mid] < nums[mid - 1])
                r = mid - 1;
            helper(nums, l, r);
        }
        return -1;
    }
}