class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int n = nums.length;

        Integer[] indexes = new Integer[n];
        for (int i = 0; i < n; i++) indexes[i] = i;

        Arrays.sort(indexes, (a, b) -> Integer.compare(nums[b], nums[a]));

        Integer[] selected = new Integer[k];

        for (int i = 0; i < k; i++) selected[i] = indexes[i];

        Arrays.sort(selected);

        int[] res = new int[k];
        for (int i = 0; i < k; i++) res[i] = nums[selected[i]];

        return res;
    }
}