class Solution {
    public int trap(int[] height) {
        int n = height.length;

        int[] leftMax = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }
        int[] rightMax = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        //- Left Max & Right Max Arrays: Store the max height encountered from left and right at each position.

        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            trappedWater += Math.min(leftMax[i], rightMax[i]) - height[i];
        }
        return trappedWater;
    }
}

// class Solution {
//     public int trap(int[] height) {
//         int n = height.length;
//         int ans = 0;
//         int l = 0;
//         int r = n - 1;
//         int lmax = 0;
//         int rmax = 0;
//         while (l < r) {
//             lmax = Math.max(lmax, height[l]);
//             rmax = Math.max(rmax, height[r]);

//             if (lmax < rmax) {
//                 ans += (lmax - height[l]);
//                 l++;
//             } else {
//                 ans += (rmax - height[r]);
//                 r--;
//             }
//         }
//         return ans;
//     }
// }