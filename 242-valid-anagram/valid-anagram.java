class Solution {
    public boolean isAnagram(String s, String t) {
        char []c = s.toCharArray();
        char []p = t.toCharArray();

        Arrays.sort(c);
        Arrays.sort(p);

        if(Arrays.equals(c,p)) return true;
        return false;
    }
}