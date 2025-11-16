class Solution {
    public int minOperations(List<Integer> nums, int k) {
        boolean[] seen = new boolean[k + 1];
        int ct = 0;
        int found = 0;
        for (int i = nums.size() - 1; i >= 0; i--) {
            ct++;
            if (nums.get(i) <= k && !seen[nums.get(i)]) {
                seen[nums.get(i)] = true;
                found++;
            }
            if (found == k)
                return ct;
        }
        return ct;
    }
}