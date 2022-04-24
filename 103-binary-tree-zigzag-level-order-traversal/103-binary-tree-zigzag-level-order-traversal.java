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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer>> ans=new ArrayList<>();
        int flag=0;
        if(root==null) return ans;
        q.add(root);
        
        while(!q.isEmpty())
        {   List<Integer> a=new ArrayList<>();
            int count=q.size();
            while(count-->0)
            {
                TreeNode temp=q.remove();
                if(temp.left!=null)
                    q.add(temp.left);
                if(temp.right!=null)
                    q.add(temp.right);
                a.add(temp.val);
            }
            if(flag%2==0)
                ans.add(a);
            else {Collections.reverse(a);ans.add(a);}
         flag++;
         
        }
        return ans;
    }
}