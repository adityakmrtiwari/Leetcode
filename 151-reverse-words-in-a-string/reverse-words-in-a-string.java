class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        StringBuilder res = new StringBuilder();
        int start;
        int end = s.length() - 1;

        while (end >= 0) {

            while (end >= 0 && s.charAt(end) == ' ') end--;
            // if (end < 0)
            //     break;

            start = end;
            while (start >= 0 && s.charAt(start) != ' ') start--;

            res.append(s, start + 1, end + 1).append(" ");
            end = start;
        }
        return res.toString().trim();
    }
}