class Solution {
    int[][] dp;

    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int i : nums) sum += i;
        if (sum % 2 != 0) return false;
        dp = new int[nums.length][sum + 1];
        for (int[] i : dp) Arrays.fill(i, -1);
        return find(nums, 0, sum / 2)==1?true:false;
    }

    public int find(int[] nums, int i, int s) {
        if (s == 0) return 1;
        if (i >= nums.length) return 0;
        if (s < 0) return 0;

        if (dp[i][s] != -1) return dp[i][s];
        return dp[i][s] = find(nums, i + 1, s - nums[i]) | find(nums, i + 1, s);
    }
}
