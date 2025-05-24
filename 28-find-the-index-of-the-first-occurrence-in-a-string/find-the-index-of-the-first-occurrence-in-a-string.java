class Solution {
    public int strStr(String haystack, String needle) {
        // This approach Checks if needle exists in haystack, character by character.
        // If mismatch, resets index. Returns starting index if found , else -1.
        int n = haystack.length();
        int m = needle.length();
        if (n < m)
            return -1;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                j++;
            } else {
                i = i - j;
                j = 0;
            }
            if (j == m) {
                return i - m + 1;
            }
        }
        return -1;

        // for direct answer
        // return haystack.indexOf(needle);
    }
}