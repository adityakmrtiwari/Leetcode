class Solution {
    public int strStr(String haystack, String needle) {
        int n = 0;

        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(n)) {
                n++;
                if (n == needle.length()) {
                    return i - n + 1;
                }
            } else {
                i = i - n;
                n = 0;
            }
        }
        return -1;
    }
}