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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        if (p != null && q != null) {
            if (p.val == q.val) {
                boolean t=isSameTree(p.left, q.left);
                boolean f = isSameTree(p.right, q.right);
                    return t && f;
            } else
                return false;
        }
        return p == q;
    }
}