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
    public int diameterOfBinaryTree(TreeNode root) {
        
       return cal(root,0);
    }
    public int calcheight(TreeNode root)
    {
        if(root==null) return 0;
        int lh=calcheight(root.left);
        int rh=calcheight(root.right);
        return 1+Math.max(lh,rh);
    }
    public int cal(TreeNode root,int val)
    {
        if(root==null) return 0;
        int lh=calcheight(root.left);
        int rh=calcheight(root.right);
        val=Math.max(val,lh+rh);
        int left=cal(root.left,val);
        int right=cal(root.right,val);
        return Math.max(val,Math.max(left,right));
    }
}