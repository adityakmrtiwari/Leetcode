class Solution {
    public int[] maxSubsequence(int[] nums, int k) {

        // 1. Attach original indices to values.
        // 2. Sort indices by values descending → find the top k elements.
        // 3. Sort selected indices ascending → restore original subsequence order.
        // 4. Output nums at those indices.
        
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