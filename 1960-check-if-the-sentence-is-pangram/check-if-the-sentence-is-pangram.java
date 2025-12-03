class Solution {
    public boolean checkIfPangram(String sentence) {
        char[] freq = new char[26];

        for (char c : sentence.toCharArray()) {
            freq[c - 'a']++;
        }

        for (int f : freq) {
            if (f == 0) return false;
        }
        return true;
    }
}