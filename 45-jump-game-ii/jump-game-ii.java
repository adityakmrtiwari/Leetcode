class Solution {
    public int jump(int[] nums) {
        int far = 0;
        int max=0;
        int ct = 0;
        for (int i = 0; i < nums.length-1; i++) {
            far=Math.max(far,i+nums[i]);
            if(i==max){
                max=far;
                ct++;
            }
        }
        return ct;
    }
}