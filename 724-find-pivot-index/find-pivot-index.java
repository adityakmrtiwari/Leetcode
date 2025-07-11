class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        for (int i = 0; i < nums.length; i++) {
            totalSum += nums[i];
        }
        int lSum = 0;
        for (int i = 0; i < nums.length; i++) {
            lSum += nums[i];
            if ((lSum - nums[i]) == (totalSum - lSum))
                return i;
        }
        return -1;
    }
}

//         int lsum = 0;
//         int rsum = 0;
//         for (int i = 0; i < nums.length; i++) {
//             lsum += nums[i];
//             for (int j = i; j < nums.length; j++) {
//                 rsum += nums[j];
//             }
//             if (lsum == rsum)
//                 return i;
//             else
//                 rsum = 0;
//         }
//         return -1;