class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // Step 1: Build frequency map
        HashMap<Integer,Integer> hs = new HashMap<>();

        for(int num : nums){
            hs.put(num,hs.getOrDefault(num,0)+1);
        }

        // Step 2: Min-heap based on frequency
        Queue<Integer> q = new PriorityQueue<>((a,b)->hs.get(b)-hs.get(a));

        for(int key:hs.keySet()){
            q.add(key);
        }

        // Step 3: Extract top k elements
        int [] ans = new int[k];
        for(int i=0;i<k;i++){
            ans[i]=q.poll();
        }
        return ans;

    }
}