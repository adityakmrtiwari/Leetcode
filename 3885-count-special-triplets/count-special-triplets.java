class Solution {
    public int specialTriplets(int[] arr) {
        // mapRight[x] = how many times value x appears to the RIGHT of current index j
        HashMap<Integer, Integer> mapRight = new HashMap<>();
        // mapLeft[x] = how many times value x appears to the LEFT of current index j
        HashMap<Integer, Integer> mapLeft = new HashMap<>();

        int n = arr.length;

        // Initially, all elements are on the RIGHT side of pointer j
        for (int x : arr) {
            mapRight.put(x, mapRight.getOrDefault(x, 0) + 1);
        }

        long count = 0; // use long to prevent overflow before modulo

        for (int j = 0; j < n; j++) {

            // We are now processing j → remove arr[j] from the RIGHT side
            mapRight.put(arr[j], mapRight.get(arr[j]) - 1);

            // Condition for special triplet:
            // nums[i] == nums[j] * 2  → value needed on LEFT side
            // nums[k] == nums[j] * 2  → value needed on RIGHT side
            int target = arr[j] * 2;

            // Number of valid i positions (on the left of j)
            int leftCount  = mapLeft.getOrDefault(target, 0);

            // Number of valid k positions (on the right of j)
            int rightCount = mapRight.getOrDefault(target, 0);

            // Each pair (i, j, k) is formed by choosing:
            //   - one i from leftCount
            //   - one k from rightCount
            count += (long) leftCount * rightCount;

            // After finishing j, move arr[j] into the LEFT side
            mapLeft.put(arr[j], mapLeft.getOrDefault(arr[j], 0) + 1);
        }

        return (int) (count % 1_000_000_007);
    }
}
