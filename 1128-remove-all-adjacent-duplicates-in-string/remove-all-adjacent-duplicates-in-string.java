class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if ((!st.isEmpty()) && (s.charAt(i) == st.peek()))
                st.pop();
            else
                st.push(s.charAt(i));
        }
        String t = "";
        while (!st.isEmpty()) {
            t = st.pop() + t;
        }
        return t;
    }
}