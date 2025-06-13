class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        ArrayList<int[]> res = new ArrayList<>();
        int i = 0;
        // store intervals before overlap
        while (i < n && intervals[i][1] < newInterval[0]) {
            res.add(intervals[i]);
            i++;
        }
        // merging the intervals 
        
        while(i<n && newInterval[1]>=intervals[i][0]){
            newInterval[0]=Math.min(newInterval[0],intervals[i][0]);
            newInterval[1]=Math.max(newInterval[1],intervals[i][1]);
            i++;
        }
        res.add(newInterval);
        // add the rest elements
        while(i<n){
            res.add(intervals[i]);
            i++;
        }
        // convert into array 
        return res.toArray(new int[res.size()][2]);
    }
}