class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> mp = new HashMap<>();

        for (int num : arr) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }
        Set<Integer> set = new HashSet<>();

        for (int val : mp.values()) {
            set.add(val);
        }
        if (set.size() != mp.size())
            return false;
        ;
        return true;
    }
}