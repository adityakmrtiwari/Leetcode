class Solution {
    public int numSub(String s) {
        long ans = 0;
        long ct = 0;
        int mod = 1_000_000_007;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '1') {
                ct++;
            } else if (ch == '0' && ct != 0) {
                ans = (ans + (ct + 1) * ct / 2) % mod;
                ct = 0;
            }
        }
        ans = (ans + (ct + 1) * ct / 2) % mod;
        return (int) ans;
    }
}