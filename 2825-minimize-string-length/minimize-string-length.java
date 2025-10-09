class Solution {
    public int minimizedStringLength(String s) {
        Set<Character> hs = new HashSet<>();
        for(int i=0;i<s.length();i++){
            hs.add(s.charAt(i));
        }
        return hs.size();
    }
}