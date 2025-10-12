class Solution {
    public int maxPower(String s) {
        int ct = 1, pow = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1))
                ct++;
            else
                ct = 1;
            pow = Math.max(pow, ct);
        }
        return pow;
    }
}