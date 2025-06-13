class Solution {
    public int findMinArrowShots(int[][] segments) {
        // Core concept: Greedy algorithm – minimize arrows by maximizing burst coverage per shot

        Arrays.sort(segments, (a, b) -> Integer.compare(a[1], b[1])); 
        // Logic: Sort balloons by their end coordinates to always aim at the "earliest finishing" balloon.
        // Why: So we can shoot an arrow that potentially bursts as many overlapping balloons as possible.

        int ans = 0, arrow = 0; 
        // ans: total arrows used
        // arrow: position where last arrow was shot

        for (int i = 0; i < segments.length; i++) {
            // Traverse sorted balloons
            if (ans == 0 || segments[i][0] > arrow) {
                // Concept: If no previous arrow OR current balloon starts AFTER the last arrow position
                // Logic: This balloon isn't burst yet, so we need a new arrow
                ans++; 
                arrow = segments[i][1]; 
                // Shoot arrow at this balloon's end point to cover as many future ones as possible
            }
        }

        return ans; 
        // Final answer: minimum arrows required to burst all balloons
    }
}