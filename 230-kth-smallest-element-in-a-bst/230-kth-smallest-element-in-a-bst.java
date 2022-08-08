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
    int count;
    public int kthSmallest(TreeNode root, int k) {
        count=k;
        int[] ans = new int[1];
        solve(root,ans);
        return ans[0];
            
    }
    public void solve(TreeNode root, int[] ans){
        if(root==null)
            return;
        solve(root.left,ans);
        if(--count==0)
            ans[0] = root.val;
        solve(root.right,ans);
        
    }
}