class Solution {
    int[] dp;

    public int jump(int[] nums) {
        dp = new int[nums.length];
        Arrays.fill(dp, (int) 1e6);
        return per(nums, 0)-1;
    }

    public int per(int[] nums, int i) {
        if (i == nums.length - 1) return 1;
        if (i >= nums.length) return (int) 1e6;
        if (dp[i] != (int) 1e6) return dp[i];
        for (int j = 1; j <= nums[i]; j++) {
            dp[i] = Math.min(dp[i], per(nums, i + j)+1) ;
        }
        return dp[i];
    }
}
