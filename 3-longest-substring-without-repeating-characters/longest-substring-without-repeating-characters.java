class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs = new HashSet<>();
        int start = 0;
        int end = 0;
        int length = 0;
        while (end < s.length()) {
            if (!hs.contains(s.charAt(end))) {
                hs.add(s.charAt(end));
                end++;
                //length = Math.max(length, end - start);
            } else {
                hs.remove(s.charAt(start));
                start++;
            }
            length = Math.max(length, end - start);
        }
        return length;
    }
}