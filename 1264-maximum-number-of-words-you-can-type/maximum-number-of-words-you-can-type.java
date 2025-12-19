class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");
        int ct = 0;

        for (String word : words) {
            boolean canType = true;

            for (char c : brokenLetters.toCharArray()) {
                if (word.indexOf(c) != -1) {
                    canType = false;
                    break;
                }

            }
            if (canType)
                ct++;
        }
        return ct;
    }
}