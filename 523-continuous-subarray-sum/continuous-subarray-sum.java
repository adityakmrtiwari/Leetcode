class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0;

        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
            int rem = prefixSum % k; // take the remainder

            // ✅ Handle the case where the prefix sum itself is divisible by k
            if (rem == 0 && i >= 1)
                return true;

            // ✅ If this remainder was seen before
            if (map.containsKey(rem)) {
                int prevIndex = map.get(rem);
                // check if subarray length ≥ 2
                if (i - prevIndex >= 2)
                    return true;
            }
            //  If this remainder is seen first time, store its index
            else {
                map.put(rem, i);
            }
        }
        return false;
    }
}


//       TLE

// public boolean checkSubarraySum(int[] nums, int k) {
//     int n = nums.length;
//     for (int i = 0; i < n; i++) {
//         int sum = nums[i];
//         for (int j = i + 1; j < n; j++) {
//             sum += nums[j];
//             if (sum % k == 0) return true;
//         }
//     }
//     return false;
// }