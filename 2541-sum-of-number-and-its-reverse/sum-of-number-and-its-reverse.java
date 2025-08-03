class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        if(num==0) return true;

        for (int i = 0; i < num; i++) {
            if (i + rev(i) == num)
                return true;
        }
        return false;
    }

    public int rev(int n) {
        int res = 0;
        int rem = 0;
        while (n > 0) {
            rem = n % 10;
            res = res * 10 + rem;
            n = n / 10;
        }
        return res;
    }
}