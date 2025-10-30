class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(s);
        Arrays.sort(g);

        int i=0;int j=0;
        int ct =0;
        while(i<g.length && j<s.length){
            if(g[i]<=s[j]){
                i++;
                j++;
                ct++;
            }else{
                j++;
            }
        }
        return ct;
    }
}