class Solution {
    public int maxTotalFruits(int[][] fruits, int startPos, int k) {
        int left = 0;
        int sum = 0;
        int maxFruits = 0;

        for (int right = 0; right < fruits.length; right++) {
            sum = sum + fruits[right][1];

            while (left <= right && steps(fruits[left][0], fruits[right][0], startPos) > k) {
                sum = sum - fruits[left][1];
                left++;
            }
            maxFruits = Math.max(maxFruits, sum);
        }
        return maxFruits;
    }

    private int steps(int left, int right, int start) {
        int distance = right - left;
        return distance + Math.min(Math.abs(start - left), Math.abs(start - right));
    }
}