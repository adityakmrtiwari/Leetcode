class Solution {
    public int minimumOperations(int[] nums) {
        int ct =0;
        for(int num : nums){
            if(num%3 ==1) ct++;
            else if(num %3 ==2) ct++;

        }
        return ct;
    }
}