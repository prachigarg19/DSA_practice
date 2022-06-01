class Solution {
    int[] dp;

    public int rob(int[] nums) {
        dp = new int[nums.length + 3];
        Arrays.fill(dp, 0);

        for (int i = nums.length ; i >= 0; i--) {
            if (i == nums.length) {
                dp[i] = 0;
                continue;
            }
            if (dp[i] != 0) continue;

            dp[i] = Math.max(dp[i + 2] + nums[i], dp[i + 1]); 
            
        }
        return dp[0];
    }
}
