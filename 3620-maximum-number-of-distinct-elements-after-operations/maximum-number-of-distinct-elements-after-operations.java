class Solution {
    public int maxDistinctElements(int[] nums, int k) {
        Arrays.sort(nums);

        int distinctCount = 0;
        int lastAssigned = Integer.MIN_VALUE;

        for (int num : nums) {
            int candidate = Math.max(lastAssigned + 1, num - k);
            if (candidate <= num + k) {
                distinctCount++;
                lastAssigned = candidate;
            }
        }
        return distinctCount;
    }
}