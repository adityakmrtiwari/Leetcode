class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        Arrays.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();
        int prev = Integer.MIN_VALUE;
        for (int i = nums.length - 1; i >= 0 && k > 0; i--) {
            if (nums[i] != prev) {
                list.add(nums[i]);
                k--;
                prev = nums[i];
            }
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}