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
    TreeNode prev;
    int ans;
    public int getMinimumDifference(TreeNode root) {
        // prev=root;
      ans=Integer.MAX_VALUE;
        dif(root);
        return ans;
    }
    public void dif(TreeNode root)
    {
        if(root==null) return;
        
        dif(root.left);
        if(prev!=null)
        ans=Math.min(ans,Math.abs(prev.val-root.val));
        prev=root;
        dif(root.right);
        
        
        
    }
}