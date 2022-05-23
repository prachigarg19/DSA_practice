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

    public int countNodes(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;
        
        //check if left or right is complete subtree
        
        //returns extreme left height
        int h1 = leftheight(root.left);
        //returns extreme right height
        int h2 = rightheight(root.right);
        
        // if perfect
        
        if(h1==h2)
            return(int)Math.pow(2,h1+1)-1;
        else
            return countNodes(root.left)+countNodes(root.right)+1;
    }

    public int leftheight(TreeNode root) {
        
        int count=0;
        while(root!=null){
            root=root.left;
            count++;
        }
        return count;
    }
    public int rightheight(TreeNode root) {
         int count=0;
        while(root!=null){
            root=root.right;
            count++;
        }
        return count;
    }
}
