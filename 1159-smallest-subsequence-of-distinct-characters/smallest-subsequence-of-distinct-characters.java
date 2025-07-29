class Solution {
    public String smallestSubsequence(String s) {
        int[] lastIndex = new int[26];
        // To store the last index of each character
        boolean[] inStack = new boolean[26];
        // // To check if character is already in stack

        // Fill lastIndex 
        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (inStack[ch - 'a']) {
                continue; // Skip if character already in result
            }

            // Remove characters from stack if:
            // - current character is smaller
            // - the character at top of stack appears again later
            while (!stack.isEmpty() && ch < stack.peek() && lastIndex[stack.peek() - 'a'] > i) {
                inStack[stack.pop() - 'a'] = false;
            }

            stack.push(ch);
            inStack[ch - 'a'] = true;
        }

        // Build result from stack
        StringBuilder result = new StringBuilder();
        for (char ch : stack) {
            result.append(ch);
        }

        return result.toString();
    }
}