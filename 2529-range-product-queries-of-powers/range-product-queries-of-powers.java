class Solution {
    public int[] productQueries(int n, int[][] queries) {
        final long MOD = 1_000_000_007;
        List<Long> powers = new ArrayList<>();
        for (int i = 0; n > 0; i++) {
            if ((n & 1) == 1)
                powers.add(1L << i);
            n >>= 1;
        }

        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            long prod = 1;
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                prod = (prod * powers.get(j)) % MOD;
            }
            ans[i] = (int) prod;
        }
        return ans;
    }
}