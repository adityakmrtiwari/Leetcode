class Solution {
    public int reverse(int x) {

        int flag = 1;
        if (x < 0)
            flag = -1;
        int rev = 0;
        x = Math.abs(x);
        while (x > 0) {
            int a = x % 10;
            if (rev > (Integer.MAX_VALUE - a) / 10)
                return 0;
                
            rev = rev * 10 + a;
            x = x / 10;

            
        }

        return rev * flag;
    }
}