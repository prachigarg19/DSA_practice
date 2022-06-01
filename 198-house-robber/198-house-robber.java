class Solution {
    int[] dp;

    public int rob(int[] nums) {
        dp = new int[nums.length + 1];
        Arrays.fill(dp,-1);
        return per(nums, 0);
    }

    public int per(int[] nums, int i) {
        if (i >= nums.length) {
            return 0;
        }
        if (dp[i] != -1) return dp[i];

        int inc = per(nums, i + 2);
        int exc = per(nums, i + 1);

        return dp[i] = Math.max(inc + nums[i], exc);
    }
}
