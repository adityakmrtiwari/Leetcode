class Solution {
    public long findTheArrayConcVal(int[] nums) {
        long concat = 0;
        int i = 0, j = nums.length - 1;
        while (i < j) {
            String s = nums[i] + "" + nums[j];
            concat += Long.parseLong(s);
            i++;
            j--;
        }

        if (i == j) {
            concat += nums[i];
        }
        return concat;
    }
}