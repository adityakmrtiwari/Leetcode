class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int res = 0;
        for (int val : map.values()) {
            res += (val * (val - 1)) / 2;
        }
        return res;
    }
}

//     public int numIdenticalPairs(int[] nums) {
//         int ct = 0;
//         for (int i = 0; i < nums.length; i++) {
//             for (int j = i+1; j < nums.length; j++) {
//                 if (nums[i] == nums[j])
//                     ct++;
//             }
//         }
//         return ct;
//     }