class Solution {
    public long minCost(int[] basket1, int[] basket2) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();

        for (int i = 0; i < basket1.length; i++) {
            map1.put(basket1[i], map1.getOrDefault(basket1[i], 0) + 1);
            map2.put(basket2[i], map2.getOrDefault(basket2[i], 0) + 1);
        }

        Set<Integer> keys = new HashSet<>();
        keys.addAll(map1.keySet());
        keys.addAll(map2.keySet());

        for (int key : keys) {
            if ((map1.getOrDefault(key, 0) + map2.getOrDefault(key, 0)) % 2 != 0)
                return -1;
        }

        List<Integer> extra = new ArrayList<>();
        int minFruit = Integer.MAX_VALUE;

        for (int key : keys) {
            minFruit = Math.min(minFruit,key);
            int diff = Math.abs(map1.getOrDefault(key, 0) - map2.getOrDefault(key, 0));
            if(diff>0){
                for(int i=0;i<diff/2;i++){
                    extra.add(key);
                }
            }
        }

        Collections.sort(extra);

        long cost = 0;
        for (int i = 0; i < extra.size() / 2; i++) {
            cost += Math.min(extra.get(i), 2 * minFruit);
        }
        return cost;
    }
}