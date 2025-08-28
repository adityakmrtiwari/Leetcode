class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left =0,right =0;
        int max_len =0;

        Set<Character> hs = new HashSet<>();

        while(right <s.length()){
            if(!hs.contains(s.charAt(right))){
                hs.add(s.charAt(right));
                max_len = Math.max(max_len,right-left+1);
                right++;
            }
            else{
                hs.remove(s.charAt(left));
                left++;
            }
        }
        return max_len;
    }
}