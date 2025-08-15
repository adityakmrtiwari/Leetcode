
class Solution {
    public String multiply(String num1, String num2) {
        // If either number is "0", the product is always "0"
        if (num1.equals("0") || num2.equals("0")) return "0";

        int n1 = num1.length();
        int n2 = num2.length();

        // Result can be at most n1 + n2 digits long
        int[] result = new int[n1 + n2];

        // Loop over each digit of num1 (from right to left)
        for (int i = n1 - 1; i >= 0; i--) {
            int digA = num1.charAt(i) - '0'; // Convert char to int

            // Loop over each digit of num2 (from right to left)
            for (int j = n2 - 1; j >= 0; j--) {
                int digB = num2.charAt(j) - '0';

                // Multiply the current digits
                int mul = digA * digB;

                // Add to the existing value in result array
                // i + j + 1 → position for the ones place
                int sum = mul + result[i + j + 1];

                // Store the ones digit at position i + j + 1
                result[i + j + 1] = sum % 10;

                // Add the carry to the next left position
                result[i + j] += sum / 10;
            }
        }

        // Build the final result string
        StringBuilder sb = new StringBuilder();
        for (int num : result) {
            // Skip leading zeros until we hit the first non-zero digit
            if (!(sb.length() == 0 && num == 0)) {
                sb.append(num);
            }
        }

        return sb.toString(); // Convert StringBuilder to String
    }
}