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
    public int rob(TreeNode root) {
        Map<TreeNode,Integer> mp=new HashMap<>();
        return per(root,mp);
    }
    public int per(TreeNode root,Map<TreeNode,Integer> mp){
        if (root == null) return 0;
        if(mp.containsKey(root)) return mp.get(root);
        int incl = 0, incr = 0;
        if (root.left != null) incl = per(root.left.left,mp) + per(root.left.right,mp);
        if (root.right != null) incr = per(root.right.right,mp) + per(root.right.left,mp);

        int excl = per(root.left,mp);
        int excr = per(root.right,mp);

        mp.put(root,Math.max(incl + incr + root.val, excl + excr));
        return mp.get(root);
    }
}
