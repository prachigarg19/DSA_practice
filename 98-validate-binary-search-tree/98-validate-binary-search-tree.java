class Solution {
    public boolean isValidBST(TreeNode root) {
        return solve(root, Long.MIN_VALUE ,Long.MAX_VALUE);
    }
    public boolean solve( TreeNode root, long min, long max){
        if(root==null) return true;
        if(root.val>=max || root.val<=min)
            return false;
        return solve(root.left, min, root.val ) && solve(root.right, root.val, max);
    }
}