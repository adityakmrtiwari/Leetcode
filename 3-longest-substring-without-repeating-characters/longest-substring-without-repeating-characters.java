class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> hs = new HashSet<>();
        int i = 0;
        int j = 0;
        int len = 0;
        while (j < s.length()) {
            if (!hs.contains(s.charAt(j))) {
                hs.add(s.charAt(j));
                j++;
                len = Math.max(len, j - i);
            } else {
                hs.remove(s.charAt(i));
                i++;
            }
        }
        return len;
    }
}