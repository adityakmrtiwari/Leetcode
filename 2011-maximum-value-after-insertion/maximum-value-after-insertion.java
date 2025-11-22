class Solution {
    public String maxValue(String n, int x) {
        char c = (char)(x + '0'); // It converts the integer x into its character form.

        if(n.charAt(0)== '-'){ // if negative
            for(int i=0;i<n.length();i++){
                if(n.charAt(i)>c)
                    return n.substring(0,i) + c + n.substring(i);
            }
            return n+c; // adding at the end if no numbers are less than x 
        }

        // for a positive
        for(int i=0;i<n.length();i++){
            if(n.charAt(i)<c)
                return n.substring(0,i) + c + n.substring(i);
        }
        return n+c;
    }
}