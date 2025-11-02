class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int task : tasks) freq.put(task,freq.getOrDefault(task,0)+1);

        int ct =0;

        for(int val : freq.values()){
            if(val == 1) return -1;
            ct += (val+2)/3;
        }
        return ct;
    }
}