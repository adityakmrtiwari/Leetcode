class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        
        int [] copySorted = nums.clone();
        Arrays.sort(copySorted);
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){
            if(!map.containsKey(copySorted[i])){
                map.put(copySorted[i],i);
            }
        }

        int [] ans = new int[n];
        for(int i=0;i<n;i++){
            ans[i] = map.get(nums[i]);
        }
        return ans;
    }
}