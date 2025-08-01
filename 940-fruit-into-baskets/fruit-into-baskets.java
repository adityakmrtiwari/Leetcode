class Solution {
    public int totalFruit(int[] fruits) {
        int left = 0;
        int maxCount = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int curr = 0; curr < fruits.length; curr++) {
            map.put(fruits[curr], map.getOrDefault(fruits[curr], 0) + 1);

            while (map.size() > 2) {
                map.put(fruits[left], map.get(fruits[left]) - 1);
                if (map.get(fruits[left]) == 0) {
                    map.remove(fruits[left]);
                }
                left++;
            }
            maxCount = Math.max(maxCount, curr - left + 1);
        }
        return maxCount;
    }
}