class Solution {
    public int getLeastFrequentDigit(int n) {
        int[] freq = new int[10];

        while (n > 0) {
            int digit = n % 10;
            freq[digit]++;
            n = n / 10;
        }

        int minFreq = Integer.MAX_VALUE;

        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0 && freq[i] < minFreq) {
                minFreq = freq[i];
            }
        }

        int res = 0;
        for (int i = 0; i < 10; i++) {
            if (freq[i] == minFreq) {
                res = i;
                break;
            }
        }
        return res;
    }
}