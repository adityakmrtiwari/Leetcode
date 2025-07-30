class Solution {
    public int compress(char[] chars) {

        // Traverse the array with two pointers: read to scan and write to overwrite.
        // For each group of repeated characters, write the character and its count (if > 1).
        // Convert count to characters and write each digit to the array.

        
        int read = 0;
        int write = 0;
        while (read < chars.length) {
            int start = read;
            while (read < chars.length && chars[read] == chars[start]) {
                read++;
            }
            chars[write] = chars[start];
            write++;
            int ct = read - start;
            if (ct > 1) {
                for (char c : String.valueOf(ct).toCharArray()) {
                    chars[write] = c;
                    write++;
                }
            }
        }
        return write;
    }
}