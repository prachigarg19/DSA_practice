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
    Map<Integer,Integer> hm;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        hm=new HashMap<>();
        for(int i=0;i<inorder.length;i++)
            hm.put(inorder[i],i);
        return solve(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
    }
    public TreeNode solve( int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd){
        
        if(preStart>preEnd || inStart> inEnd)
            return null;
        TreeNode root = new TreeNode(preorder[preStart]);
        
        int ind = hm.get(root.val);
        int leftnum = ind - inStart;
        
        root.left = solve(preorder,preStart+1,preStart+leftnum,inorder,inStart,ind-1);
        root.right = solve(preorder,preStart+leftnum+1,preEnd,inorder,ind+1,inEnd);
        return root;
    }
}