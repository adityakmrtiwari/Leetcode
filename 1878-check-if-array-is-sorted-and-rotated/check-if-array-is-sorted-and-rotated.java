class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        if(n<=1) return true;
        int ct =0;
        for(int i=0;i<n;i++){
            int j = (i+1)%n;
            if(nums[i]>nums[j]) ct++;
            if(ct>1) return false;
        }
        return true;
    }
}