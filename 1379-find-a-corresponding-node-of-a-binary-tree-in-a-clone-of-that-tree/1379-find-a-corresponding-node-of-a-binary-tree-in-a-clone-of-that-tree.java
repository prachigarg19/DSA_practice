/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
       
        return in( original,cloned,target,false);
    }
    public TreeNode in( TreeNode original, TreeNode cloned,TreeNode target,boolean ans){
         if(original==null||cloned==null)
            return null;
        TreeNode left = in(original.left,cloned.left,target,ans);
        if(original.val==target.val && cloned.val==target.val)
            return cloned;
        TreeNode right = in(original.right,cloned.right,target,ans);
        if(left!=null || right!=null)
            return left==null?right:left;
        return null;
    }
}