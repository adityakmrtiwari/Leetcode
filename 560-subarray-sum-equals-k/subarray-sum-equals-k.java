class Solution {
    public int subarraySum(int[] nums, int k) {
        int ct =0;
        int prefixSum =0;

        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);

        for(int num : nums){
            prefixSum += num;

            if(map.containsKey(prefixSum-k)){
                ct += map.get(prefixSum-k);
            }

            map.put(prefixSum , map.getOrDefault(prefixSum , 0)+1);
        }

        return ct;
    }
}