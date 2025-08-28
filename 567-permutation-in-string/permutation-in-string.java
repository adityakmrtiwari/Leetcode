class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int m = s1.length(), n = s2.length();

        if (m > n)
            return false;

        char c1[] = s1.toCharArray();
        Arrays.sort(c1);

        for (int i = 0; i <= n - m; i++) {
            char c2[] = s2.substring(i, i + m).toCharArray();
            Arrays.sort(c2);
            if (Arrays.equals(c1, c2))
                return true;

        }

        return false;
    }
}