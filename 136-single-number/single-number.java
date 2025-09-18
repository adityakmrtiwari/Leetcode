class Solution {
    public int singleNumber(int[] nums) {

        // as xor cancels out when same only left the distinct element
        int ans = 0;
        for (int num : nums) {
            ans = ans ^ num;
        }
        return ans;
    }
}

// this approach uses memory so less efficient 

// class Solution {
//     public int singleNumber(int[] nums) {
//         Map<Integer, Integer> hs = new HashMap<>();
//         for (int num : nums) {
//             hs.put(num, hs.getOrDefault(num , 0) + 1);
//         }

//         for (int key : hs.keySet()) {
//             if (hs.get(key) == 1)
//                 return key;
//         }
//         return -1;
//     }
// }