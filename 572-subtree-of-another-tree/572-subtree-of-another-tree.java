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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        return findRoot(root,subRoot);
    }
    public boolean findRoot(TreeNode root, TreeNode sroot){
        if(root==null) return false;
        boolean lt = findRoot(root.left,sroot);
        boolean rt = findRoot(root.right,sroot);
        if(root.val==sroot.val) {
            if(check(root,sroot))
                return true;
        }
        if(lt||rt) return true;
        return false;
    }
    
    public boolean check(TreeNode root, TreeNode sroot){
        if(root==null&&sroot==null) return true;
        if(root==null || sroot==null) return false;
        boolean lt = check(root.left, sroot.left);
        boolean rt = check(root.right, sroot.right);
        if(lt&&rt&&root.val==sroot.val)
            return true;
        return false;
    }
}