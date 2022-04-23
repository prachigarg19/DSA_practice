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
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        int lh=calcheight(root.left);
        int rh=calcheight(root.right);
        boolean left=isBalanced(root.left);
        boolean right=isBalanced(root.right);
        if(left==false||right==false) return false;
        return Math.abs(lh-rh)<=1?true:false;
    }
    
    public int calcheight(TreeNode root)
    {
        if(root==null) return 0;
        int lh=calcheight(root.left);
        int rh=calcheight(root.right);
        // ans==false?false:(Ma/th.abs(lh-rh)<=1?true:false);
        return 1+Math.max(lh,rh);
    }
}