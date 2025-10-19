class Solution {
    public int maxProduct(int[] nums) {
        int minProd = nums[0];
        int maxProd = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = maxProd;
                maxProd = minProd;
                minProd = temp;
            }

            maxProd = Math.max(maxProd * nums[i], nums[i]);
            minProd = Math.min(minProd * nums[i], nums[i]);

            max = Math.max(maxProd, max);
        }
        return max;
    }
}