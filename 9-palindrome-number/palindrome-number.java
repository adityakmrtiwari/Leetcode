class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
        return false;

        int a =x;
        int rev =0;
        while(a>0){
            int dig = a%10;
            rev = rev*10 +dig;
            a=a/10;
        }
        return x==rev;
    }
}