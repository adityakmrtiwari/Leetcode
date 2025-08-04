class Solution {
    public long repairCars(int[] ranks, int cars) {
        int maxRank = 0;
        for (int rank : ranks)
            maxRank = Math.max(maxRank, rank);
        long left = 1;
        long right = (long) maxRank * cars * (long) cars;

        long ans = 0;

        while (left <= right) {
            long mid = (left + right) / 2;

            if (canDo(ranks, mid, cars)) {
                ans = mid;
                right = mid - 1;
            } else
                left = mid + 1;
        }
        return ans;
    }

    private boolean canDo(int[] ranks, long mid, int cars) {
        long totalCars = 0;
        for (int i = 0; i < ranks.length; i++) {
            totalCars += (long)Math.sqrt(mid / ranks[i]);

            if (totalCars >= cars) return true;
        }
        return false;
    }
}