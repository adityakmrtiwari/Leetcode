class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        ArrayList<Integer> candies = new ArrayList<>(Collections.nCopies(n, 1));

        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i-1])
                candies.set(i,candies.get(i-1) + 1);
        }
        for(int i=n-2;i>=0;i--){
            if(ratings[i]>ratings[i+1])
                candies.set(i,Math.max(candies.get(i+1)+1,candies.get(i)));
        }
        int totalCandy=0;
        for(int candy:candies){
            totalCandy+=candy;
        }
        return totalCandy;
    }
}