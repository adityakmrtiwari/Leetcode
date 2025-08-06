class Solution {
    public String decodeString(String s) {
        Stack<Integer> numSt = new Stack<>();
        Stack<String> strSt = new Stack<>();

        StringBuilder str = new StringBuilder();
        int currNum = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                currNum = currNum * 10 + (ch - '0');
            } else if (ch == '[') {
                numSt.push(currNum);
                strSt.push(str.toString());
                currNum = 0;
                str = new StringBuilder();
            } else if (ch == ']') {
                int repeat = numSt.pop();
                StringBuilder decoded = new StringBuilder(strSt.pop());
                for (int i = 0; i < repeat; i++) {
                    decoded.append(str);
                }
                str = decoded;
            } else {
                str.append(ch);
            }
        }
        return str.toString();
    }
}