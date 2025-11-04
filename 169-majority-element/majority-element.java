class Solution {
    public int majorityElement(int[] nums) {

        int ct = 0;
        int candidate = 0;

        for (int num : nums) {
            if (ct == 0) candidate = num;
            ct += (num == candidate) ? 1 : -1;
        }
        
        return candidate;
    }
}