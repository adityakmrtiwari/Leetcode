class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        boolean[] visited = new boolean[fruits.length];
        for (int i = 0; i < fruits.length; i++) {
            for (int j = 0; j < baskets.length; j++) {
                if (fruits[i] <= baskets[j] && visited[j] != true) {
                    visited[j] = true;
                    break;
                }
            }
        }
        int ct = 0;
        for (int i = 0; i < fruits.length; i++) {
            if (visited[i] != true)
                ct++;
        }
        return ct;
    }
}