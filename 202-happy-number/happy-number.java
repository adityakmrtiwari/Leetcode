class Solution {
    public boolean isHappy(int n) {
        // Base case: 1 and 7 are known happy numbers
        if(n == 1 || n == 7) return true;

        // For single-digit numbers other than 1 or 7, return false
        else if(n < 10) return false;

        else {
            int sum = 0;

            // Calculate sum of squares of digits
            while(n > 0) {
                int temp = n % 10;       // Get last digit
                sum += temp * temp;      // Square it and add to sum
                n = n / 10;              // Remove last digit
            }

            // Recursively check if the new sum is happy
            return isHappy(sum);
        }
    }
}
