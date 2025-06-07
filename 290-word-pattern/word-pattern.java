class Solution {
    public boolean wordPattern(String pattern, String s) {
        // Step 1: Split the input string into words
        String[] words = s.split(" ");
        
        // Step 2: Check if the number of words matches the pattern length
        if (words.length != pattern.length()) return false;

        // Step 3: Use a single HashMap to store character-to-index and word-to-index mappings
        Map<Object, Object> map = new HashMap<>();

        // Step 4: Iterate through pattern and words, mapping both to their first occurrence index
        for (int i = 0; i < pattern.length(); i++) {
            if (!Objects.equals(map.put(pattern.charAt(i), i), map.put(words[i], i))) {
                return false; // If mismatch is found, return false
            }
        }

        return true; // If all mappings are consistent, return true
    }
}

/* 
\U0001f539 Revision Notes \U0001f539
✅ The function checks if 's' follows the character pattern in 'pattern'
✅ Uses a single HashMap to track first occurrence indexes for both characters and words
✅ Objects.equals() prevents NullPointerException when comparing old values
✅ If a mismatch is found (different first occurrences), return false
*/