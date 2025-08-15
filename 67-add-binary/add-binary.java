class Solution {
    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;

        int carry = 0;

        StringBuilder sb = new StringBuilder();

        while (i >= 0 || j >= 0 || carry != 0) {
            int digA = (i >= 0) ? a.charAt(i) - '0' : 0;
            int digB = (j >= 0) ? b.charAt(j) - '0' : 0;

            int sum = digA + digB + carry;
            int resultBit;

            // Explicit cases for binary addition
            if (sum == 0) { // 0 + 0 + 0
                resultBit = 0;
                carry = 0;
            } else if (sum == 1) { // 1 + 0 + 0 or 0 + 1 + 0
                resultBit = 1;
                carry = 0;
            } else if (sum == 2) { // 1 + 1 + 0 or 1 + 0 + 1, etc.
                resultBit = 0;
                carry = 1;
            } else { // sum == 3 → 1 + 1 + 1
                resultBit = 1;
                carry = 1;
            }

            sb.append(resultBit);

            i--;
            j--;
        }

        return sb.reverse().toString();
    }
}