class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) return "";

        int lenGcd = gcd(str1.length(), str2.length());
        return str1.substring(0, lenGcd);
    }

    private int gcd(int len1, int len2) {
        if (len2 == 0) return len1;
        else return gcd(len2, len1 % len2);
    }
}