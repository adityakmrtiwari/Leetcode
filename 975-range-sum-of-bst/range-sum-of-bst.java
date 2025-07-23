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
    public int rangeSumBST(TreeNode root, int low, int high) {
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        int sum = 0;
        while (!st.isEmpty()) {
            TreeNode temp = st.pop();
            if (temp == null)
                continue;

            if (temp.val >= low && temp.val <= high) {
                sum += temp.val;
                st.push(temp.left);
                st.push(temp.right);
            } else if (temp.val < low)
                st.push(temp.right);
            else
                st.push(temp.left);
        }
        return sum;
    }
}