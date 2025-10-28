class Solution {
    public long removeZeros(long n) {
        String s = String.valueOf(n);
        String r = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '0')
                r = r + s.charAt(i);
        }
        return Long.parseLong(r);
    }
}