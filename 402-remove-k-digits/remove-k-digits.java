class Solution {
    public String removeKdigits(String num, int k) {

        if(num.length()<=k)
           return "0";

        Stack<Character> st = new Stack<>();
        for (int i = 0; i < num.length(); i++) {
          
            while (!st.isEmpty() && num.charAt(i) < st.peek() && k > 0) {
                st.pop();
                k--;
            }
            st.push(num.charAt(i));
        }
        while (!st.isEmpty() && k > 0) {
            st.pop();
            k--;
        }
        String s = "";
        while (!st.isEmpty()) {
            s = st.pop() + s;
        }
        int m = 0;
        while (m < s.length() && s.charAt(m) == '0') {
            m++;
        }
        s = s.substring(m);
        if(s.length()==0)
           return "0";
        return s;
    }
}