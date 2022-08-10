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

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) return null;
        return solve(nums, 0, nums.length-1);
    }

    public TreeNode solve(int[] nums, int s, int e) {
        if (s > e) return null;
        int length = e+s;
        // System.out.println("end" +" "+e+"," + "start"+" "+s+","+length);
        TreeNode root = new TreeNode(nums[length / 2]);
        root.left = solve(nums, s, length / 2 - 1);
        root.right = solve(nums, length / 2 + 1, e);
        return root;
    }
}
