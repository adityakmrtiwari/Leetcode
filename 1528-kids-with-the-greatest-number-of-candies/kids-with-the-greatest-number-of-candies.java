class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (candies[i] > max)
                max = candies[i];
        }
        int diff = max-extraCandies;
        List<Boolean> result = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(candies[i]>=diff)
                result.add(true);
            else result.add(false);
        }
        return result;
    }
}