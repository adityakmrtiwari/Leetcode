class Solution {
    public int dominantIndex(int[] nums) {
        int lar =0;
        int sec =0;
        int ind =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>lar){
                sec = lar;
                lar = nums[i];
                ind = i;
            }else if(nums[i]>sec){
                sec = nums[i];
            }
        }
        if(lar>= 2* sec) return ind;
        return -1;
    }
}