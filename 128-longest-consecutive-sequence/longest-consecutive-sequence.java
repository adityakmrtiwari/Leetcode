class Solution {
    public int longestConsecutive(int[] numbers) {
        int totalNumbers = numbers.length;
        if (totalNumbers == 0)
            return 0; // Empty array edge case

        int maxSequenceLength = 1; // At least one number means min sequence of 1
        HashSet<Integer> numberSet = new HashSet<>();

        // Add all numbers to the HashSet
        for (int i = 0; i < totalNumbers; i++) {
            numberSet.add(numbers[i]);
        }

        // Check each number in the set
        for (int currentNumber : numberSet) {
            // Check if it's the start of a sequence
            if (!numberSet.contains(currentNumber - 1)) {
                int currentSequenceLength = 1;
                int nextNumber = currentNumber + 1;

                // Count the length of the current consecutive sequence
                while (numberSet.contains(nextNumber)) {
                    currentSequenceLength++;
                    nextNumber++;
                }

                // Update the max length found so far
                maxSequenceLength = Math.max(maxSequenceLength, currentSequenceLength);
            }
        }

        return maxSequenceLength;
    }
}