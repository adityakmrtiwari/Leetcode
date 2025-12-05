class Solution {
    public int countPartitions(int[] nums) {
        int total = 0;
        for (int num : nums) {
            total += num;
        }
        int ct = 0;
        int sum = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            sum += nums[i];
            if ((sum - (total - sum)) % 2 == 0)
                ct++;
        }
        return ct;
    }
}