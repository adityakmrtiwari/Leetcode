class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int min = 1;
        int max = 1;
        for (int m : piles) {
            if (m > max)
                max = m;
        }
        int ans = max; 
        while (min <= max) {
            int mid = (min + max) / 2;
            if (helper(piles, h, mid)) {
                ans = mid;
                max = mid - 1;
            } else
                min = mid + 1;
        }
        return ans;
    }

    private boolean helper(int [] piles , int h , int speed){
        int time =0;
        for(int i=0;i<piles.length;i++){
            time+=(int)Math.ceil((double)piles[i]/speed);
            if(time>h)
                return false;
        }
        return true;
    }
}