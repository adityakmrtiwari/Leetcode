class Solution {
    public int jump(int[] nums) {
        int far = 0;
        int max=0;
        int ct = 0;
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = 1; j <= nums[i]; j++) {
                if (i + j > far){
                    far = i + j;
                }
            }
            if(i==max){
                max=far;
                ct++;
            }
        }
        return ct;
    }
}