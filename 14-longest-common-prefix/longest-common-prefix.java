class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String prefix = strs[0];  // Start with the first word

        for (int i = 1; i < strs.length; i++) {
            String word = strs[i];

            // Keep shrinking prefix until it's at the start of word
            while (!word.contains(prefix) || word.indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty()) return "";
            }
        }

        return prefix;
    }
}
