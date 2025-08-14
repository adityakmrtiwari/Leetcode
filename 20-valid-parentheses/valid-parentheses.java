class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        if(n==1)
        return false;
        Stack <Character> st = new Stack<>();

        for(int i=0;i<n;i++){
            Character ch = s.charAt(i);
            if(ch =='(' || ch =='{' || ch == '[')
                st.push(ch);
            else if (ch ==')'){
                if(st.isEmpty()) return false;

                if(st.peek()=='(') st.pop();
                else return false;
            }
            else if (ch ==']'){
                if(st.isEmpty()) return false;

                if(st.peek()=='[') st.pop();
                else return false;
            }
            else if (ch =='}'){
                if(st.isEmpty()) return false;

                if(st.peek()=='{') st.pop();
                else return false;
            }
        }

        return st.isEmpty();
    }
}