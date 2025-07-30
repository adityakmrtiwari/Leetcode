class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return helper(firstWord)+helper(secondWord)==helper(targetWord);
    }

    public int helper(String s){
        String st ="";
        for(int i=0;i<s.length();i++){
            st=st+(s.charAt(i)-'a');
        }
        return Integer.parseInt(st);
    }
}