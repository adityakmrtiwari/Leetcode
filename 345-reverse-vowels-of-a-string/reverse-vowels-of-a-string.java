class Solution {
    public String reverseVowels(String s) {
        StringBuilder ans = new StringBuilder(s);

        int i = 0;
        int j = s.length() - 1;
        String vow = "aeiouAEIOU";

        while (i < j) {
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);

            if ((vow.indexOf(ch1) != -1)) {
                if (vow.indexOf(ch2) != -1) {
                    ans.setCharAt(i++, ch2);
                    ans.setCharAt(j, ch1);
                }
                j--;
            } else
                i++;
        }
        return ans.toString();
    }
}