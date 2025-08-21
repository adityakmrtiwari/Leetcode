class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals ,(a,b)->a[1]-b[1]);
        int ct =0;
        int lastInd =Integer.MIN_VALUE;

        for(int []arr: intervals){
            if(arr[0]>=lastInd){
                ct++;
                lastInd=arr[1];
            }
        }
        return intervals.length-ct;
    }
}