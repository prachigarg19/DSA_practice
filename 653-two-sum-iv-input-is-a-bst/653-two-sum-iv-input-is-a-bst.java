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
    boolean flag;
    public boolean findTarget(TreeNode root, int k) {
        flag=false;
        TreeNode temp=root;
        in(root,k,temp);
        return flag;
    }
    public void in(TreeNode root,int k,TreeNode head)
    {
        if(root==null) return;
        in(root.left,k,head);
        Bsearch(root,head,k-root.val);
        in(root.right,k,head);
    }
    public void Bsearch(TreeNode root,TreeNode head,int k)
    {   
        if(head==null) return;
        while(head!=null)
        {
            if(head.val==k&&root!=head) 
            {   
                flag=true;
                return;
            }
            else if(head.val<k)
                head=head.right;
            else head=head.left;
        }
    }
}