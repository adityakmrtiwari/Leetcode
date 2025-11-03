class Solution {
    public int minDeletion(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        if (map.size() <= k) return 0;

        List<Integer> freq = new ArrayList<>(map.values());
        Collections.sort(freq);

        int ct = 0;
        int distinct = map.size();

        for (int i = 0; i < freq.size() && distinct > k; i++) {
            ct += freq.get(i);
            distinct--;
        }
        return ct;
    }
}