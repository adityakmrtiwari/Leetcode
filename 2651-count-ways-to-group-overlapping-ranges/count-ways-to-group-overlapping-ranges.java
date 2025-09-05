class Solution {
    public int countWays(int[][] ranges) {
        final int MOD = 1_000_000_007;

        Arrays.sort(ranges, (a, b) -> Integer.compare(a[0], b[0]));

        int res = 1;
        int last = -1;

        for (int[] r : ranges) {
            if (r[0] > last) {   // found a new component
                res = (res * 2) % MOD;
            }
            last = Math.max(last, r[1]); // extend the current merged range
        }
        return res;
    }
}