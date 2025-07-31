class Solution {
    public int lastRemaining(int n) {
        int head = 1;        // The first number in the current sequence
        int step = 1;        // Distance between consecutive numbers
        int remaining = n;   // Number of elements still in the sequence
        boolean left = true; // Direction of elimination: true = left to right, false = right to left

        while (remaining > 1) {
            // If we're going left to right, we always move the head forward
            // If we're going right to left, we only move the head forward when remaining is odd
            if (left || remaining % 2 == 1) {
                head += step;
            }

            // Double the step since every round removes every other element
            step *= 2;

            // Half the remaining elements are removed in each round
            remaining /= 2;

            // Flip the direction for the next round
            left = !left;
        }

        // When only one element is left, it's the head
        return head;
    }
}