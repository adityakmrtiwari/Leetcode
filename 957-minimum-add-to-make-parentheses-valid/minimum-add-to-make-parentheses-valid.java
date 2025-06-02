class Solution {
    public int minAddToMakeValid(String s) {
        int open =0 , close =0;
        int i=0;

        while (i<s.length()){
            char c = s.charAt(i);
            if(c == '(')
            open++;
            else{
                if(open>0)
                open--;
                else
                close++;
            }
            i++;
        }
        return open + close;
    }
}