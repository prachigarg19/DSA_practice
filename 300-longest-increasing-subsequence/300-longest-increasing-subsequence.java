class Solution {
    int[][] dp;

    public int lengthOfLIS(int[] nums) {
        dp = new int[nums.length + 1][nums.length + 1];
        for (int[] i : dp) Arrays.fill(i, -1);
        return per(nums, 0, -1);
    }

    public int per(int[] nums, int i, int pi) {
        if (i >= nums.length) 
            return 0;
        if (pi != -1 && dp[i][pi] != -1) return dp[i][pi];
        int inc = 0;
        if (pi == -1 || nums[i] > nums[pi]) inc = per(nums, i + 1, i) + 1;
        int exc = per(nums, i + 1, pi);
        
        if(pi!=-1) dp[i][pi] = Math.max(inc, exc);
        return Math.max(inc, exc);
    }
}
