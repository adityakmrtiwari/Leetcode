class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] mergeSorted = new int[n + m];

        int i = 0, j = 0;
        int k = 0;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                mergeSorted[k] = nums1[i];
                i++;
            } else {
                mergeSorted[k] = nums2[j];
                j++;
            }
            k++;
        }
        while (i < m) {
            mergeSorted[k] = nums1[i];
            k++;
            i++;
        }
        while (j < n) {
            mergeSorted[k] = nums2[j];
            k++;
            j++;
        }

        double ans = 0;
        k = mergeSorted.length;
        if (k % 2 == 0) {
            ans = (mergeSorted[k / 2] + mergeSorted[k / 2 - 1]) / 2.0;
        }
        else{
            ans = mergeSorted[k / 2];
        }
        return ans;
    }
}