import java.util.Arrays;

class Solution {
    private int[] parent;

    // find(x): earliest available day >= x (with path compression)
    private int find(int x) {
        if (parent[x] != x) parent[x] = find(parent[x]);
        return parent[x];
    }

    public int maxEvents(int[][] events) {
        // Greedy: process by earliest end first
        Arrays.sort(events, (a, b) -> a[1] - b[1]);

        int maxDay = 0;
        for (int[] e : events) maxDay = Math.max(maxDay, e[1]);

        // parent[d] = next available day >= d; sentinel at maxDay+1
        parent = new int[maxDay + 2];              // indices 1..maxDay+1
        for (int d = 1; d <= maxDay + 1; d++) parent[d] = d;

        int count = 0;
        for (int[] e : events) {
            int s = e[0], t = e[1];
            int d = find(s);                       // earliest free day >= s
            if (d <= t) {                          // fits in [s, t]
                count++;
                parent[d] = find(d + 1);           // mark day d used → next free after d
            }
        }
        return count;
    }
}
