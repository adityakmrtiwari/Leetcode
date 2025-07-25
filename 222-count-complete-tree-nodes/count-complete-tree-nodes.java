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
    public int countNodes(TreeNode root) {
        if (root == null)
            return 0;

        int ct = 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        ct++;

        while (!q.isEmpty()) {
            TreeNode curr = q.poll();

            if (curr.left != null) {
                ct++;
                q.offer(curr.left);
            }
            if (curr.right != null) {
                ct++;
                q.offer(curr.right);
            }
        }
        return ct;
    }
}