class Solution {
    public void sortColors(int[] nums) {
        int r0 = 0;
        int w1 = 0;
        int b2 = 0;

        for (int num : nums) {
            if (num == 0) r0++;
            else if (num == 1) w1++;
            else b2++;
        }
        int i = 0;
        while (i < r0) nums[i++] = 0;
        while (i < r0 + w1) nums[i++] = 1;
        while (i < nums.length) nums[i++] = 2;
    }
}