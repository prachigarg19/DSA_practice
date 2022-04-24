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
    public int maxPathSum(TreeNode root) {
        long ans[]=new long[1];
        ans[0]=Integer.MIN_VALUE;
        calc(root,0,ans);
        return (int)ans[0];
    }
    public long calc(TreeNode root,long sum,long ans[])
    {
        if(root==null) return 0;
        long lh=Math.max(0,calc(root.left,sum,ans));
        long rh=Math.max(0,calc(root.right,sum,ans));
        sum=Math.max(root.val,lh+rh+root.val);
        ans[0]=Math.max(ans[0],sum);
        return root.val+Math.max(lh,rh);
    }
}