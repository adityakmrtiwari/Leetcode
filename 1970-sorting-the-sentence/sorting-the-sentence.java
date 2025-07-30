class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] result = new String[words.length];

        for (String word : words) {
            int len = word.length();
            int pos = word.charAt(len - 1) - '0'; // get the position digit
            result[pos - 1] = word.substring(0, len - 1); // remove digit
        }

        return String.join(" ", result);
    }
}

// Split the sentence into words.
// Use the trailing digit to place each word at the correct index.
// Remove digits and join the words to form the original sentence.
