class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (a, b) -> a[1] - b[1]);

        int length = 0;
        int latestPair = Integer.MIN_VALUE;

        for (int[] arr : pairs) {
            if (arr[0] > latestPair) {
                length++;
                latestPair = arr[1];
            }
        }
        return length;
    }
}