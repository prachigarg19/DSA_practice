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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        hm=new HashMap<>();
        for(int i=0;i<inorder.length;i++)
            hm.put(inorder[i],i);
        return solve(inorder,0,inorder.length-1,postorder,0,postorder.length-1);
    }

 public TreeNode solve( int[] inorder, int inStart, int inEnd, int[] postorder,int ps, int pe){
        
        if(ps>pe || inStart> inEnd)
            return null;
        TreeNode root = new TreeNode(postorder[pe]);
        
        int ind = hm.get(root.val);
        int leftnum = ind - inStart;
        
        root.left = solve(inorder,inStart,ind-1,postorder,ps,ps+leftnum-1);
        root.right = solve(inorder,ind+1,inEnd,postorder,ps+leftnum,pe-1);
        return root;
 }
}