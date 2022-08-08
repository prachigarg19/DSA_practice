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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        solve(root,ans,0);
        return ans;
    }
    public void solve( TreeNode root, List<Integer> al, int level){
        if(root==null)
            return;
        if(level>=al.size())
            al.add(root.val);
        else al.set(level,root.val);
        
        solve(root.left, al, level+1);
        solve(root.right,al, level+1);
            
    }
}