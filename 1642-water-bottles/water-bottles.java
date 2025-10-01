class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int res = numBottles;
        int empty = numBottles;

        while (empty >= numExchange ) {
            int newBottles = empty / numExchange;
            res += newBottles;
            empty = newBottles + (empty % numExchange); 
        }
        return res;
    }
}