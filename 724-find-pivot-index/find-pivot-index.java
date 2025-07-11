class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        int rsum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            for (int j = i; j < nums.length; j++) {
                rsum += nums[j];
            }
            if (sum == rsum)
                return i;
            else
                rsum = 0;
        }
        return -1;
    }
}