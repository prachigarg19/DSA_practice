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
    public int goodNodes(TreeNode root) {
       
        return solve(root,root.val);
    }
    public int solve( TreeNode root, int max){
        if(root==null) return 0;
        if(max<=root.val){ 
            max = Math.max(max,root.val);
            return solve(root.left,max)+solve(root.right,max)+1;
        }
        return solve(root.left,max)+solve(root.right,max);
    }
}