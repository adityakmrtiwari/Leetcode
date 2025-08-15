class Solution {
    public int countSegments(String s) {
        s = s.trim();
        int n = s.length();
        if (s.equals(""))
            return 0;
        int ct = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == ' '){
                if(i<n&&s.charAt(i+1)==' ')
                    continue;
                else ct++;
            }
        }
        return ct + 1;
    }
}