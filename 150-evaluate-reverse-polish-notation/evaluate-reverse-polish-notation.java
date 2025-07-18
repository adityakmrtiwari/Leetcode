class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        int p1, p2;
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("+")) {
                p1 = st.pop();
                p2 = st.pop();
                st.push(p2 + p1);
            } else if (tokens[i].equals("-")) {
                p1 = st.pop();
                p2 = st.pop();
                st.push(p2 - p1);
            } else if (tokens[i].equals("*")) {
                p1 = st.pop();
                p2 = st.pop();
                st.push(p2 * p1);
            } else if (tokens[i].equals("/")) {
                p1 = st.pop();
                p2 = st.pop();
                st.push(p2 / p1);
            } else
                st.push(Integer.parseInt(tokens[i]));
        }
        return st.pop();
    }
}