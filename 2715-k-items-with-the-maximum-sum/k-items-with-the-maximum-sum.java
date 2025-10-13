class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int ans = 0;
        if (numOnes >= k)
            return k;
        else if (numOnes < k) {
            ans += numOnes;
            k = k - numOnes;
            if (numZeros > k) {
                return ans;
            } else if (numZeros < k) {
                k = k - numZeros;
                ans = ans - k;
            }
        }
        return ans;
    }
}