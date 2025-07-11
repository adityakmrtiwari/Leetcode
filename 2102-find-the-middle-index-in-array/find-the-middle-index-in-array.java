class Solution {
    public int findMiddleIndex(int[] nums) {
        int totalSum = 0;
        for (int i = 0; i < nums.length; i++) {
            totalSum += nums[i];
        }
        int lSum = 0;
        for (int i = 0; i < nums.length; i++) {
            lSum += nums[i];
            if ((lSum - nums[i]) == (totalSum - lSum))
                return i;
        }
        return -1;
    }
}