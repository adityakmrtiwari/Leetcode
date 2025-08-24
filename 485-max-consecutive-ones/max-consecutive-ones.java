class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ones = 0;
        int maxConOnes = 0;
        for (int num : nums) {
            if (num == 1)
                ones++;
            maxConOnes = Math.max(maxConOnes,ones);
            if (num == 0){
                
                ones =0;
            }
        }
        return maxConOnes;
    }
}