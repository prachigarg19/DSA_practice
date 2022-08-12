/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while (root != null) {
            if (root.val == p.val) return p;
            if (root.val == q.val) return q;
            if ((root.val > p.val && root.val < q.val) || (root.val > q.val && root.val<p.val)) return root;
            if ((root.val < p.val && root.val < q.val)) root = root.right; else root = root.left;
        }
        return root;
    }
}
