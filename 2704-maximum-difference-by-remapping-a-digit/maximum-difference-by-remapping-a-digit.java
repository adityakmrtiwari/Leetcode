class Solution {
    public int minMaxDifference(int num) {
        String s = Integer.toString(num);
        int n = s.length();

        char digit1 = ' ';
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != '9') {
                digit1 = s.charAt(i);
                break;
            }
        }

        String max = "";
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == digit1) {
                max += '9';
            } else
                max += s.charAt(i);
        }
        char digit2 = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != '0') {
                digit2 = s.charAt(i);
                break;
            }
        }
        String min = "";
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == digit2) {
                min += '0';
            } else
                min += s.charAt(i);
        }
        int minNum = Integer.parseInt(min), maxNum = Integer.parseInt(max);
        return maxNum - minNum;
    }
}