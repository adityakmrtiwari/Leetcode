class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] trustCount = new int[n + 1]; // index 0 is unused

        for (int[] t : trust) {
            int a = t[0];
            int b = t[1];
            trustCount[a]--; // a trusts someone => lose point
            trustCount[b]++; // b is trusted by someone => gain point
        }

        for (int i = 1; i <= n; i++) {
            if (trustCount[i] == n - 1) {
                return i; // only person trusted by everyone else and trusts no one
            }
        }

        return -1; // no judge found
    }
}