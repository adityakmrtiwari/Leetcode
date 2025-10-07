class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int posInd = 0, negInd = 1;
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                res[posInd] = nums[i];
                posInd += 2;
            } else {
                res[negInd] = nums[i];
                negInd += 2;
            }
        }
        return res;
    }
}