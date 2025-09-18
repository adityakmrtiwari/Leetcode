class Solution {
    public int majorityElement(int[] nums) {
        int ct = 0, candidate = 0;
        for (int num : nums) {
            if (num == candidate)
                ct++;
            else if (ct == 0) {
                candidate = num;
                ct++;
            } else
                ct--;
        }
        return candidate;
    }
}