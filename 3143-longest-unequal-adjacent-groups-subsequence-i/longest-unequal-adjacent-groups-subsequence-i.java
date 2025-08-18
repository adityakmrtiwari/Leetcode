class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> st = new ArrayList<>();
        st.add(words[0]);
        for(int i=1;i<groups.length;i++){
            if(groups[i]!=groups[i-1])
                st.add(words[i]);
        }
        return st;
    }
}