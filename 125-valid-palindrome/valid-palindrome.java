class Solution {
    public boolean isPalindrome(String s) {
        s = s.trim();
        String st = "";

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                st = st + s.charAt(i);
            }
        }
        st = st.toLowerCase();

        int l = 0, r = st.length() - 1;

        while (l <= r) {
            if (st.charAt(l) != st.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }
}