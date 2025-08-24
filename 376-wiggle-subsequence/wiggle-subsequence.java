class Solution {
    public int wiggleMaxLength(int[] nums) {
        int n = nums.length;
        int flag = 0;
        int ct = 1;
        int maxCt = 1;

        for (int i = 1; i < n; i++) {
            if (nums[i] > nums[i - 1] && flag != 1) {
                flag = 1;
                ct++;
            } else if (nums[i] < nums[i - 1] && flag != -1) {
                flag = -1;
                ct++;
            }
            maxCt = Math.max(maxCt, ct);

        }
        return maxCt;
    }
}