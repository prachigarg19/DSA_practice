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
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        boolean flag1=false,flag2=false;
        if(root==null||root.val==x||root.val==y) return false;
        q.add(root);
        while(q.size()!=0)
        {
            int count=q.size(),isPresent=0;
            while(count-->0)
            {   
                TreeNode temp=q.remove();
                if(temp.left!=null&&temp.right!=null&&temp.left.val==x&&temp.right.val==y)
                    return false;
                 if(temp.left!=null&&temp.right!=null&&temp.left.val==y&&temp.right.val==x)
                    return false;
                if(temp.left!=null)
                { if(temp.left.val==x||temp.left.val==y) 
                    isPresent++;
                    q.add(temp.left);}
                if(temp.right!=null)
                 { if(temp.right.val==x||temp.right.val==y)
                     isPresent++;
                     q.add(temp.right);
                 }
                
            }
            if(isPresent==2) return true;
        }
        return false;
    }
}