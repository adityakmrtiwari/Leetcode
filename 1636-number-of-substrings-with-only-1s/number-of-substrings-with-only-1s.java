class Solution {
    public int numSub(String s) {
        long ans = 0;
        long ct = 0;
        int mod = 1_000_000_007;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                ct++;
                ans = (ans + ct) % mod;
            }else{
                ct=0;
            }
        }
        return (int) ans;
    }
}