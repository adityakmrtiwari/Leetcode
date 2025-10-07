class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] posArr = new int[n/2];
        int[] negArr = new int[n/2];
        int p=0,m=0;

        for(int i=0;i<n;i++){
            if(nums[i]>0){
                posArr[p++] = nums[i];
            }
            else{
                negArr[m++]=nums[i];
            }
        }
        p=0;
        m=0;
        int i=0;
        while(i<n){
            nums[i++]=posArr[p++];
            nums[i++]=negArr[m++];
        }
        return nums;
    }
}