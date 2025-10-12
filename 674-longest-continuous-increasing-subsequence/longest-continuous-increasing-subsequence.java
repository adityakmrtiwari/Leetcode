class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int ct = 1, maxL=1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1])
                ct++;
            else
                ct = 1;
            maxL = Math.max(maxL, ct);
        }
        return maxL;
    }
}