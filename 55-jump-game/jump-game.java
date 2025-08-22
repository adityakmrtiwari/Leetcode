class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;

        int f = 0;

        for (int i = 0; i <= f && i < n-1; i++) {
            f = Math.max(f, i + nums[i]);
        }
        return f >= n-1;
    }
}