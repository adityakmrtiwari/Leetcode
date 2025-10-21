class Solution {
    public String mergeAlternately(String word1, String word2) {
        String ans = "";
        int m = word1.length();
        int n = word2.length();
        int i = 0, j = 0;
        while (i < m && j < n) {
            ans = ans + word1.charAt(i++);
            ans = ans + word2.charAt(j++);
        }

        if (i == m)
            ans = ans + word2.substring(j, n);
        else
            ans = ans + word1.substring(i, m);

        return ans;
    }
}