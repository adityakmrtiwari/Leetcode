class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // hum piche se bharenge bcz nums1 ke piche khali hai and agr aage se bhare
        // to nums1 ke elem over write ho ke lost ho sakta..agar nums2 ke elemnt likhte hai to

        int i = m - 1;
        int j = n - 1;
        int k = n + m - 1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) nums1[k--] = nums1[i--];
            else nums1[k--] = nums2[j--];
        }
    }
}