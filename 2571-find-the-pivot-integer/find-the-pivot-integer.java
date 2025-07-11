class Solution {
    public int pivotInteger(int n) {
        int prevSum=0;
        int totalSum=0;
        for(int i=1;i<=n;i++){
            totalSum+=i;
        }
        for(int i=1;i<=n;i++){
            prevSum+=i;
            if(prevSum==totalSum-prevSum+i)
            return i;
        }
        return -1;
    }
}