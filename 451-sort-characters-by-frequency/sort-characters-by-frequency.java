class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        List<Character> chars = new ArrayList<>(map.keySet());

        chars.sort((a, b) -> map.get(b) - map.get(a));

        StringBuilder res = new StringBuilder();

        for (char ch : chars) {
            res.append(String.valueOf(ch).repeat(map.get(ch)));
        }

        return res.toString();

    }
}