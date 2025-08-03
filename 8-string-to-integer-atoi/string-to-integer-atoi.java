class Solution {
    public int myAtoi(String s) {

         s = s.trim();

        if(s.length()==0)
           return 0;
       

       
        int res = 1;
        int i = 0;
        long ans = 0;

        if (s.charAt(0) == '-') {
            res = -1;
            i = 1;
        }

        else if (s.charAt(0) == '+') {
            res = 1;
            i = 1;
        }

        while (i < s.length()) {
            char c = s.charAt(i);
            if (c < '0' || c > '9')
                break;

            ans = ans * 10 + (c - '0');

            if(res==-1 && -ans<Integer.MIN_VALUE)
               return Integer.MIN_VALUE;
            else if(res==1 && ans>Integer.MAX_VALUE)
               return Integer.MAX_VALUE;

            i++;
        }
        ans =  ans * res;

        

        return (int)ans;        

    }
}