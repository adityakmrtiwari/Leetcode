class Solution {
    public int expressiveWords(String s, String[] words) {

        // Compare groups of characters in s and word using two pointers.
        // A group in s can match a shorter group in word only if it's 3+ chars.
        // Count all words that can be stretched to match s using this rule.
        
        int ct = 0;
        for (String word : words) {
            if (isStretchy(s, word))
                ct++;
        }
        return ct;
    }

    private boolean isStretchy(String s, String word) {
        int i = 0, j = 0;
        while (i < s.length() && j < word.length()) {
            if (s.charAt(i) != word.charAt(j))
                return false;

            int l1 = getGroupLength(s, i);
            int l2 = getGroupLength(word, j);

            if (l1 < l2)
                return false;
            if (l1 != l2 && l1 < 3)
                return false;

            i += l1;
            j += l2;

        }
        return i == s.length() && j == word.length();
    }

    private int getGroupLength(String str, int ind) {
        int start = ind;
        while (ind < str.length() && str.charAt(ind) == str.charAt(start)) {
            ind++;
        }
        return ind - start;
    }
}