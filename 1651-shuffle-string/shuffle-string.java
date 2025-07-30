class Solution {
    public String restoreString(String s, int[] indices) {
        char[] ch = new char[s.length()];
        int j=0;
        for(int i=0;i<s.length();i++){
            ch[indices[j]]=s.charAt(i);
            j++;
        }
        return new String(ch);
    }
}