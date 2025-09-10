class Solution {
    public int[][] merge(int[][] intervals) {
        // Step 1: Sort intervals by start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> result = new ArrayList<>();

        // Start with the first interval
        int[] current = intervals[0];
        result.add(current);

        for (int[] interval : intervals) {
            // If intervals overlap, extend the current interval
            if (interval[0] <= current[1]) {
                current[1] = Math.max(current[1], interval[1]);
            } else {
                // If no overlap, move to next interval
                current = interval;
                result.add(current);
            }
        }

        return result.toArray(new int[result.size()][]);
    }
}