import java.util.*;

class Solution {
    public long minCost(int[] basket1, int[] basket2) {
        // Step 1: Count the frequency of each fruit in both baskets
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();

        for (int i = 0; i < basket1.length; i++) {
            map1.put(basket1[i], map1.getOrDefault(basket1[i], 0) + 1);
            map2.put(basket2[i], map2.getOrDefault(basket2[i], 0) + 1);
        }

        // Step 2: Create a set of all unique fruits from both baskets
        Set<Integer> keys = new HashSet<>();
        keys.addAll(map1.keySet());
        keys.addAll(map2.keySet());

        // Step 3: Check if it is possible to make baskets equal
        // If total count of any fruit (basket1 + basket2) is odd, return -1
        for (int key : keys) {
            if ((map1.getOrDefault(key, 0) + map2.getOrDefault(key, 0)) % 2 != 0)
                return -1; // Not possible to balance
        }

        // Step 4: Prepare a list of extra fruits that need to be swapped
        List<Integer> extra = new ArrayList<>();
        int minFruit = Integer.MAX_VALUE; // To track the smallest fruit value

        for (int key : keys) {
            minFruit = Math.min(minFruit, key); // Update minimum fruit value
            int diff = Math.abs(map1.getOrDefault(key, 0) - map2.getOrDefault(key, 0));
            
            // If there is a difference in count for this fruit
            if (diff > 0) {
                // Add half of the difference (because two baskets share difference equally)
                for (int i = 0; i < diff / 2; i++) {
                    extra.add(key);
                }
            }
        }

        // Step 5: Sort the extra fruits to pick the smallest first for minimal cost
        Collections.sort(extra);

        // Step 6: Calculate minimum cost
        // We only need to process half of 'extra' because each swap fixes two positions
        long cost = 0;
        for (int i = 0; i < extra.size() / 2; i++) {
            // Cost is either the fruit value itself or 2 * minFruit (cheaper option)
            cost += Math.min(extra.get(i), 2 * minFruit);
        }

        return cost;
    }
}
