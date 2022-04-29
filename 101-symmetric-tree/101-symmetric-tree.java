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
    public boolean isSymmetric(TreeNode root) {
          if(root==null||(root.left==null&&root.right==null)) return true;
        if(root.left==null||root.right==null) return false;
        return check(root.left, root.right) ;
    }
    public boolean check(TreeNode root1, TreeNode root2) 
        {if(root1==null&&root2==null) 
            return true;
         if(root1==null||root2==null) return false;
    boolean outside=check(root1.left, root2. right);
        boolean inside=check(root1.right , root2. left) ;
    if(outside==false||inside==false) return false;
    if(root1.val!=root2.val) return false;
    return true;
}
}