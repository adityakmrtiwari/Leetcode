class Solution {
    public int countDistinctIntegers(int[] nums) {
        Set <Integer> s = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            s.add(nums[i]);
            s.add(rev(nums[i]));
        }
        return s.size();
    }
    public int rev(int n) {
        int res = 0;
        int rem = 0;
        while (n > 0) {
            rem = n % 10;
            res = res * 10 + rem;
            n = n / 10;
        }
        return res;
    }
}

//1353