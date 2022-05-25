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
    Stack<TreeNode> st;

    public boolean isValidBST(TreeNode root) {
        st = new Stack<>();
        if (root.left == null && root.right == null) return true;
        per(root);
        int val = st.pop().val;
        while (!st.isEmpty()) {
            if (val <= st.peek().val) return false;
            val = st.pop().val;
        }
        return true;
    }

    public TreeNode per(TreeNode root) {
        if (root == null) return null;

        TreeNode left = per(root.left);

        st.push(root);

        TreeNode right = per(root.right);
        
        
        return root;
    }
}
