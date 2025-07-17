class Solution {
    public boolean isValid(String s) {
        if (s.length() == 1)
            return false;
        if (s.length() == 0)
            return true;
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (st.isEmpty() && (s.charAt(i) == ']' || s.charAt(i) == '}' || s.charAt(i) == ')'))
                return false;
            if (s.charAt(i) == '[' || s.charAt(i) == '{' || s.charAt(i) == '(')
                st.push(s.charAt(i));
            else if (s.charAt(i) == ')' && st.peek() == '(') {
                st.pop();
            } else if (s.charAt(i) == '}' && st.peek() == '{') {
                st.pop();
            } else if (s.charAt(i) == ']' && st.peek() == '[') {
                st.pop();
            } else
                return false;
        }
        if (!st.isEmpty())
            return false;
        return true;
    }
}