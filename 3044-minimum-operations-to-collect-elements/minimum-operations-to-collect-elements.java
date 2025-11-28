class Solution {
    public int minOperations(List<Integer> nums, int k) {
        int n = nums.size();

        boolean[] seen = new boolean[k + 1];

        int found = 0;
        int ops = 0;

        for (int i = n - 1; i >= 0; i--) {
            ops++;
            if (nums.get(i) <= k && !seen[nums.get(i)]) {
                seen[nums.get(i)] = true;
                found++;
                if (found == k)
                    return ops;
            }
        }
        return ops;
    }
}