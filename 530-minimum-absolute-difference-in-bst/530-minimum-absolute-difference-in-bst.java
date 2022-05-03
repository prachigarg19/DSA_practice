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
    int ans;
    public int getMinimumDifference(TreeNode root) {
        ans=Integer.MAX_VALUE;
        if(root==null) return 0;
        TreeNode head=root;
        in(root,head);
        return ans;
    }
    public void in(TreeNode root,TreeNode head)
    {
        if(root==null) return;
        in(root.left,head);
        dif(root,head);
        in(root.right,head);
        
    }
    public void dif(TreeNode root,TreeNode head)
    {
        if(head==null) return;
        dif(root,head.left);
        dif(root,head.right);
        if(head!=root)
        ans=Math.min(Math.abs(head.val-root.val),ans);
        
    }
}