class Solution {
    public int minMaxDifference(int num) {
        String s = Integer.toString(num);
        int n = s.length();

        // Find the first digit that is not '9' to replace for max
        char digit1 = ' ';
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != '9') {
                digit1 = s.charAt(i);
                break;
            }
        }

        // Build max number by replacing digit1 with '9'
        StringBuilder max = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == digit1) {
                max.append('9');
            } else {
                max.append(s.charAt(i));
            }
        }

        // Find the first digit that is not '0' to replace for min
        char digit2 = ' ';
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != '0') {
                digit2 = s.charAt(i);
                break;
            }
        }

        // Build min number by replacing digit2 with '0'
        StringBuilder min = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == digit2) {
                min.append('0');
            } else {
                min.append(s.charAt(i));
            }
        }

        int maxNum = Integer.parseInt(max.toString());
        int minNum = Integer.parseInt(min.toString());

        return maxNum - minNum;
    }
}
