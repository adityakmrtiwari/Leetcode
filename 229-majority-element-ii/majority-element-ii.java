class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        for (Integer key : map.keySet()) {
            if (map.get(key) > n / 3) {
                list.add(key);
            }
        }
        return list;
    }
}