class Solution {
    int dp[][];

    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int a : nums) {
            sum += a;
        }
        if (sum % 2 != 0) return false;

        dp = new int[nums.length + 1][sum / 2 + 1];

        for (int i = 0; i < dp.length; i++) Arrays.fill(dp[i], -1);
        return per(nums, 0, sum / 2) == 1 ? true : false;
    }

    public int per(int[] nums, int i, int sum) {
        if (sum == 0) return 1;
        if (sum < 0) return 0;
        if (i == nums.length) {
            return 0;
        }

        if (dp[i][sum] != -1) return dp[i][sum];

        int inc = per(nums, i + 1, sum - nums[i]);
        int exc = per(nums, i + 1, sum);
        return dp[i][sum] = (inc | exc);
    }
}
