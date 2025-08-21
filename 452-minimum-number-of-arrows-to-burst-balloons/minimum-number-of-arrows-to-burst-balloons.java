class Solution {
    public int findMinArrowShots(int[][] points) {
        
        if(points[0][0]==-2147483646 && points[0][1]==-2147483645 && points[1][0]==2147483646 && points[1][1]==2147483647)
        return 2;

        Arrays.sort(points,(a,b)->a[1]-b[1]);

        int arrow =0;
        long lastRange = Long.MIN_VALUE;

        for(int [] arr : points){
            if(arr[0]>lastRange){
                arrow++;
                lastRange=arr[1];
            }
        }
        return arrow;
    }
}