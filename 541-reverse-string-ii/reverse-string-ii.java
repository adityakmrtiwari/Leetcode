class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder(s);

        for (int st = 0; st < s.length(); st = st + 2 * k) {

            int l = st;
            int r = Math.min(st + k - 1, s.length() - 1);
            while (l < r) {
                char ch = sb.charAt(l);
                sb.setCharAt(l, sb.charAt(r));
                sb.setCharAt(r, ch);
                l++;
                r--;
            }

        }
        return sb.toString();
    }
}