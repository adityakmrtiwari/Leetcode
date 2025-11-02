class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num: nums) map.put(num,map.getOrDefault(num,0)+1);

        int ct =0;
        for(int val : map.values()){
            if(val == 1) return -1;
            ct += (val + 2) / 3;
        }
        return ct;
    }
}