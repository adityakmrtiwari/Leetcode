class Solution {
    public int pivotIndex(int[] nums) {
        int lsum = 0;
        int rsum = 0;
        for (int i = 0; i < nums.length; i++) {
            lsum += nums[i];
            for (int j = i; j < nums.length; j++) {
                rsum += nums[j];
            }
            if (lsum == rsum)
                return i;
            else
                rsum = 0;
        }
        return -1;
    }
}