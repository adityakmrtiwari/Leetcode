class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1) return 0;
        int n = nums.length;
        int ct =0,left =0;
        int prod =1;

        for(int right =0;right<nums.length;right++){
            prod *=nums[right];

            while(prod>=k){
                prod /=nums[left++];
            }
            ct += right-left+1;
        }
        return ct;   
    }
}