class Solution {
    public int minStartValue(int[] nums) {
        int prefixSum =0;
        int min =0;

        for(int i=0;i<nums.length;i++){
            prefixSum +=nums[i];
            min = Math.min(min,prefixSum);
        }
        return 1-min;
    }
}