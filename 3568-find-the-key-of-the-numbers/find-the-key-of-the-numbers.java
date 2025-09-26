class Solution {
    public int generateKey(int num1, int num2, int num3) {
        String s1 = String.format("%04d", num1);
        String s2 = String.format("%04d", num2);
        String s3 = String.format("%04d", num3);

        StringBuilder key = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            char c3 = s3.charAt(i);

            char minDigit = (char) Math.min(Math.min(c1, c2), c3);
            key.append(minDigit);
        }
        int keyInt = Integer.parseInt(key.toString());
        return keyInt;
    }
}