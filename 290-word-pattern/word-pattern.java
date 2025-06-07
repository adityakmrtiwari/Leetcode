class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (words.length != pattern.length()) return false;

        Map<Object, Object> map = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            if (!Objects.equals(map.put(pattern.charAt(i), i), map.put(words[i], i))) {
                return false;
            }
        }
        return true;

    }
}