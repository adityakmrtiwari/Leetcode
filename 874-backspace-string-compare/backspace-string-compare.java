class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> sts = new Stack<>();
        Stack<Character> stt = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '#') {
                if (!sts.isEmpty()) sts.pop();
            } else
                sts.push(c);
        }
        for (char c : t.toCharArray()) {
            if (c == '#') {
                if (!stt.isEmpty()) stt.pop();
            } else
                stt.push(c);
        }
        return stt.equals(sts);
    }
}