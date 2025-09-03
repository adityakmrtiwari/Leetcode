class Solution {
    public String reverseWords(String s) {
        int n = s.length();

        StringBuilder result = new StringBuilder();

        for (String st : s.split(" ")) {
            StringBuilder sb = new StringBuilder(st);
            sb.reverse();
            result.append(sb).append(" ");
        }
        return result.toString().trim();
    }
}