class Solution {
    public int numberOfWays(int n, int x) {
        final int MOD = 1_000_000_007;
        // build powers list: 1^x, 2^x, ... while <= n
        List<Integer> powers = new ArrayList<>();
        for (int i = 1; ; i++) {
            long p = 1;
            for (int k = 0; k < x; k++) p *= i;
            if (p > n) break;
            powers.add((int)p);
        }

        // dp[s] = number of ways to make sum s
        int[] dp = new int[n + 1];
        dp[0] = 1;

        // For each power, do 0/1 subset-sum update (descending)
        for (int p : powers) {
            for (int s = n; s >= p; s--) {
                dp[s] = (int)((dp[s] + (long)dp[s - p]) % MOD);
            }
        }
        return dp[n];
    }
}