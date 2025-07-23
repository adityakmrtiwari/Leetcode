/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int[] findMode(TreeNode root) {
        if (root == null) return new int[0];
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        Map<Integer, Integer> map = new HashMap<>();
        while (!q.isEmpty()) {
            TreeNode temp = q.poll();
            map.put(temp.val, map.getOrDefault(temp.val, 0) + 1);

            if (temp.left != null)
                q.offer(temp.left);
            if (temp.right != null)
                q.offer(temp.right); 
        }

        int maxFreq =0;
        for(int freq:map.values()){
            maxFreq = Math.max(maxFreq,freq);
        }

        List<Integer> modes = new ArrayList<>();
        for(int key : map.keySet()){
            if(map.get(key) == maxFreq){
                modes.add(key);
            }
        }

        int res[] = new int [modes.size()];
        for(int i=0;i<modes.size();i++){
            res[i] = modes.get(i);
        }
        return res;
    }
}