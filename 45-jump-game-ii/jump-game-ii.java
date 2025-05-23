class Solution {
    public int jump(int[] nums) {
        if(nums.length<=1) return 0;
        int maxReach = nums[0];
        int steps = nums[0];
        int jumpCount = 1;

        for (int i = 1; i < nums.length - 1; i++) {
            maxReach = Math.max(maxReach, i + nums[i]);
            steps--;

            if (steps == 0) {
                jumpCount++;
                steps = maxReach - i;
            }
        }
        return jumpCount;
    }
}