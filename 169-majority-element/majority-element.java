class Solution {
    public int majorityElement(int[] nums) {
        int ct = 0;
        int majority = 0;
        for (int num : nums) {
            if (ct == 0)
                majority = num;
            if (majority == num)
                ct++;
            else
                ct--;

        }
        return majority;
    }
}