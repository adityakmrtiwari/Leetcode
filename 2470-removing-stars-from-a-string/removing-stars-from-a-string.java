class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        int star =0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isLetter(ch))
                st.push(ch);
            else {
                st.pop();
            }
        }

        StringBuilder sb = new StringBuilder();

        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        sb.reverse();

        return sb.toString();
    }
}