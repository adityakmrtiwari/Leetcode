class Solution {
    public int smallestIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i == sumDigits(nums[i])) return i;
        }
        return -1;
    }

    private int sumDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int lastDig = n % 10;
            sum += lastDig;
            n = n / 10;
        }
        return sum;
    }
}