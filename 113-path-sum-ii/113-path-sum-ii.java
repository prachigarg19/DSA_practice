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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> al=new ArrayList<>();
        sum(root,targetSum,0,ans,al);
        return ans;
    }
    public void sum(TreeNode root, int tsum, int csum, List<List<Integer>> ans ,List<Integer> al)
    {
        if(root==null)
        {  
            return;
        }
        if(isNode(root))
        {
            csum+=root.val;
            al.add(root.val);
               if(csum==tsum)
            {   
                ans.add(new ArrayList<Integer>(al));
            }
            return;
        }
          
        al.add(root.val);
       if(root.left!=null)
       {sum(root.left,tsum,csum+root.val,ans,al);
        al.remove(al.size()-1);
       }
        if(root.right!=null){
        sum(root.right,tsum,csum+root.val,ans,al);
        al.remove(al.size()-1);
        }
        
        
    }
    public boolean isNode(TreeNode root)
    {
        if(root.left==null&&root.right==null) return true;
        else return false;
    }
}