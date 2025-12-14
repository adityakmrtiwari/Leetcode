class Solution {
    public String reverseWords(String s) {
        String words[] = s.split(" ");

        int firstVowCt = vowelCt(words[0]);

        for (int i = 1; i < words.length; i++) {
            if (vowelCt(words[i]) == firstVowCt) {
                words[i] = new StringBuilder(words[i]).reverse().toString();
            }
        }

        return String.join(" ", words);
    }

    public int vowelCt(String word) {
        int ct = 0;
        String vow = "aeiou";
        for (int i = 0; i < word.length(); i++) {
            if (vow.indexOf(word.charAt(i)) != -1)
                ct++;
        }
        return ct;
    }
}