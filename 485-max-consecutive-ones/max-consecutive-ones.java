class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int ct =0;
        for(int num : nums){
            if(num ==0) ct =0;
            else ct++;
            max = Math.max(max,ct);
        }
        return max;
    }
}