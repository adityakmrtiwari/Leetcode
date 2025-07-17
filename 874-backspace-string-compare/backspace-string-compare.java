class Solution {
    public boolean backspaceCompare(String s, String t) {

        Stack<Character> st = new Stack<>();
        Stack<Character> ts = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '#') {
                st.push(s.charAt(i));
            } else if (s.charAt(i) == '#' && st.isEmpty())
                continue;
            else if (s.charAt(i) == '#')
                st.pop();
        }

        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) != '#') {
                ts.push(t.charAt(i));
            }  else if (t.charAt(i) == '#' && ts.isEmpty())
                continue;
            else if (t.charAt(i) == '#')
                ts.pop();
        }

        if (st.size() != ts.size())
            return false;

        while (!st.isEmpty()) {
            if (st.pop() != ts.pop())
                return false;
        }
        return true;
    }
}