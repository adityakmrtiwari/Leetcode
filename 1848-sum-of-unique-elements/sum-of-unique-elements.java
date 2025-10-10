class Solution {
    public int sumOfUnique(int[] nums) {
        Map<Integer,Integer> mp = new HashMap<>();

        for(int num : nums) mp.put(num,mp.getOrDefault(num,0)+1);

        int sum =0;
        for(int key : mp.keySet()){
            if(mp.get(key)==1) sum += key;
        }
        return sum;
    }
}