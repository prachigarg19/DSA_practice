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
    public int maxLevelSum(TreeNode root) {
        if(root==null) return 0;
        int level=1,i=1;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int tsum=root.val;
        while(!q.isEmpty())
        {   int csum=0;
            int count=q.size();
            while(count-->0)
            {
                TreeNode temp=q.remove();
                if(temp.left!=null)
                    q.add(temp.left);
                if(temp.right!=null)
                    q.add(temp.right);
                csum+=temp.val;
            }
         if(tsum<csum)
         {
             level=i;
             tsum=csum;
         }
         i++;
        }
        
      return level;  
    }
}