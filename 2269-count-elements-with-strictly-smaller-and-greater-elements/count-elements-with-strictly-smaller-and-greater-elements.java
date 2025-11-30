class Solution {
    public int countElements(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        int res =0;
        for(int val : map.keySet()){
            if(val != min && val != max)
                res = res + map.get(val);
        }

        return res;
    }
}