class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {

        List<List<Integer>> res = new ArrayList<>();
        
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++)
            {
                min = Math.min(min,arr[i+1] - arr[i]);
            }

        for(int i=1;i<arr.length;i++)
            {
                if(arr[i] - arr[i-1] == min)
                {
                    ArrayList<Integer> sub = new ArrayList<>();
                    sub.add(arr[i-1]);
                    sub.add(arr[i]);
                    res.add(Arrays.asList(arr[i-1],arr[i]));
                }
            }
        return res;
    }
}