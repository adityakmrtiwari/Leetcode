class Solution {
    public boolean canJump(int[] nums) {
        int lastPos = nums.length - 1;
        for (int ind = nums.length - 2; ind >= 0; ind--) {
            if (ind + nums[ind] >= lastPos)
                lastPos = ind;
        }
        return lastPos == 0;
    }
}