class Solution {
    public String reverseParentheses(String s) {
        // LOGIC :- Each '(' creates a new level → push a new StringBuilder.
        //          Each ')' completes a level → pop, reverse, and merge into the previous level.
        Stack<StringBuilder> st = new Stack<>();
        st.push(new StringBuilder());

        for (char ch : s.toCharArray()) {
            if (ch == '(')
                st.push(new StringBuilder());
            else if (ch == ')') {
                StringBuilder temp = st.pop();
                temp.reverse();
                st.peek().append(temp);
            } else
                st.peek().append(ch);
        }

        return st.pop().toString();
    }
}