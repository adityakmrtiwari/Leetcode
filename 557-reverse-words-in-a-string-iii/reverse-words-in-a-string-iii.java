class Solution {
    public String reverseWords(String s) {
        int n = s.length();

        StringBuilder result = new StringBuilder();

        for (String st : s.split(" ")) {
            StringBuilder sb = new StringBuilder(st);
            int l = 0, r = sb.length() - 1;
            while (l < r) {
                char ch = sb.charAt(l);
                sb.setCharAt(l, sb.charAt(r));
                sb.setCharAt(r, ch);
                l++;
                r--;
            }
            result.append(sb).append(" ");
        }
        return result.toString().trim();
    }
}