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
    boolean flag;
    public boolean isUnivalTree(TreeNode root) {
        flag=true;
        int k=root.val;
        in(root,k);
        return flag;
    }
    public void in(TreeNode root,int k)
    {
        if(root==null) return;
        in(root.left,k);
        if(root.val!=k) {
            flag=false;
            return;
        }
        in(root.right,k);
        
    }
}