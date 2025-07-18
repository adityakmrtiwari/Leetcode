class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character> st = new Stack<>();

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                st.push(ch);
                while (!st.isEmpty()) {
                    ans.append(st.pop());
                }
                
                break;
            } else {
                st.push(word.charAt(i));
            }
        }
        for (int i = ans.length(); i < word.length(); i++) {
            ans.append(word.charAt(i));
        }
        return ans.toString();
    }
}