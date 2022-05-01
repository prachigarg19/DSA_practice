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
    TreeNode dummy;
    public TreeNode increasingBST(TreeNode root) {
        dummy=new TreeNode(-1);
        TreeNode head=dummy;
        in(root);
        return head.right;
    }
    public void in(TreeNode root){
        
        if(root == null)
        {
           return; 
        }
        in(root.left);
        dummy.right=new TreeNode(root.val);
        dummy=dummy.right;
        in(root.right);
    }
}