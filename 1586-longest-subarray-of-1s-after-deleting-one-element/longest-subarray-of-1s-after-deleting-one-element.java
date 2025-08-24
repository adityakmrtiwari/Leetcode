class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;

        int ones = 0;
        int max = 0;
        int prev = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                ones++;
            }  else {
                prev=ones;
                ones = 0;
            }
            max = Math.max(max, prev+ones);
        }
        return max == n ? max - 1 : max;
    }
}