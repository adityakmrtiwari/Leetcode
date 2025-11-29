class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if (n == 0)
            return 0;

        int maxLen = 1;

        Set<Integer> numSet = new HashSet<>();

        for (int num : nums)
            numSet.add(num);

        for (int num : numSet) {
            if (!numSet.contains(num - 1)) {
                int len = 1;
                int nextNum = num + 1;

                while (numSet.contains(nextNum)) {
                    len++;
                    nextNum++;
                }
                maxLen = Math.max(maxLen, len);
            }
        }
        return maxLen;

    }
}