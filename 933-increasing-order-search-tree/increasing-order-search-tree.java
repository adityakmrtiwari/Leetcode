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
    public TreeNode increasingBST(TreeNode root) {
        Stack<TreeNode> st = new Stack<>();
        TreeNode dummy = new TreeNode(0);
        TreeNode ans = dummy;
        TreeNode temp = root;
        while (temp != null || !st.isEmpty()) {
            while (temp != null) {
                st.push(temp);
                temp = temp.left;
            }
            temp = st.pop();

            temp.left = null;
            dummy.right = temp;
            dummy = dummy.right;

            temp = temp.right;

        }
        return ans.right;
    }
}