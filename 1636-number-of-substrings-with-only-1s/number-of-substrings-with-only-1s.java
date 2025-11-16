class Solution {
    public int numSub(String s) {
        int n = s.length();
        int mod = 1000000007;
        int ct =0;
        int ans =0;
        for(char ch : s.toCharArray()){
            if(ch == '1'){
                ct++;
                ans = (ans+ct)%mod;
            }
            else ct =0;
        }
        return ans;
    }
}