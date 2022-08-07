class Solution {
    int[][] dp;

    public int change(int amount, int[] coins) {
        dp = new int[coins.length+1][amount + 1];
        for(int[] i: dp)
        Arrays.fill(i,-1);
        return solve(amount, coins, 0);
    }

    public int solve(int s, int[] coins, int i) {
        if (s == 0) {
            return 1;
        }
        if (i >= coins.length) return 0;
        if (s < 0) return 0;
        if (dp[i][s] != -1) return dp[i][s];
        int count = 0;
        for (int j = i; j < coins.length; j++) {
            count += solve(s - coins[j], coins, j);
        }
        return dp[i][s] = count;
    }
}
