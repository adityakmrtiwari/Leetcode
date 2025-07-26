class Solution {
    public int incremovableSubarrayCount(int[] nums) {
        int n = nums.length;
        int ct = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (isStrictlyIncreasing(nums, i, j))
                    ct++;
            }
        }
        return ct;
    }

    private boolean isStrictlyIncreasing(int[] nums, int st, int end) {
        int prev = -1;
        for (int i = 0; i < nums.length; i++) {
            if (i >= st && i <= end)
                continue;
            if (prev != -1 && nums[i] <= prev)
                return false;
            prev = nums[i];
        }
        return true;
    }
}