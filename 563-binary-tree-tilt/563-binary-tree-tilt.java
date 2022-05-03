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
    int sum;
    public int findTilt(TreeNode root) {
        sum=0;
        post(root);
       return sum;
    }
    public int post(TreeNode root)
    {
        if(root==null) return 0;
        int left=post(root.left);
        int right=post(root.right);
        sum+=Math.abs(left-right);
        return root.val+left+right;
    }
}