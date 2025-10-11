class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, len = 0;

        Set<Character> hs = new HashSet<>();
        for (int right = 0; right < s.length(); right++) {
            while (hs.contains(s.charAt(right))) {
                hs.remove(s.charAt(left++));
            }
            hs.add(s.charAt(right));
            len = Math.max(len, right - left + 1);
        }
        return len;
    }
}