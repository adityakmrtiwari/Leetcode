class Solution {
    public boolean reorderedPowerOf2(int n) {
        int[] targetCount = digitCount(n);

        for (int i = 0; i <= 30; i++) {
            int powerof2 = 1<<i;
            if (sameCount(targetCount, digitCount(powerof2)))
                return true;
        }
        return false;
    }

    // Step A: Count digits
    private int[] digitCount(int x) {
        int[] count = new int[10];
        while (x > 0) {
            count[x % 10]++;
            x /= 10;
        }
        return count;
    }

    // Step C: Compare two frequency arrays
    private boolean sameCount(int[] a, int[] b) {
        for (int i = 0; i < 10; i++) {
            if (a[i] != b[i])
                return false;
        }
        return true;
    }
}