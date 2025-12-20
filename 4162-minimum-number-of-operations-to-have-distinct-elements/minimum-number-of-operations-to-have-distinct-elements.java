class Solution {
    public int minOperations(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        int duplicates = 0;

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
            if (freq.get(num) == 2) {
                duplicates++;
            }
        }

        if (duplicates == 0) return 0;

        int ops = 0;
        int i = 0;

        while (i < nums.length && duplicates > 0) {
            for (int k = 0; k < 3 && i < nums.length; k++, i++) {
                int val = nums[i];
                int count = freq.get(val);

                if (count == 2)
                    duplicates--;

                if (count == 1) {
                    freq.remove(val);
                } else {
                    freq.put(val, count - 1);
                }
            }
            ops++;
        }

        return ops;
    }
}