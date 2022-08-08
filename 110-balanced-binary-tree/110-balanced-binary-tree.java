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
        if(root==null)
            return true;
        int hl= height(root.left);
        int hr= height(root.right);
        
        boolean bl = isBalanced(root.left);
        boolean br = isBalanced(root.right);
        
        if(bl && br && Math.abs(hl-hr)<=1)
            return true;
        return false;
    }
    public int height( TreeNode root){
        if(root==null) return 0;
        
        return Math.max(height(root.left),height(root.right))+1;
    }
}