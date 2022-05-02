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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans=new ArrayList<>();
        depth(root,ans,"");
        return ans;
    }
    public void depth(TreeNode root,List<String> ans,String str)
    {
        if(root==null)
        {
         return;}
        if(str.length()!=0)
            str+="->";
        str+=Integer.toString(root.val);
        if(root.left==null&&root.right==null)
        {ans.add(str);
         return;}
        depth(root.left,ans,str);
        str=str.substring(0,str.length());
        depth(root.right,ans,str);
        str=str.substring(0,str.length());
    }
}