class Solution {
    int[][] dp;

    public int coinChange(int[] coins, int amount) {
        dp = new int[coins.length + 1][amount + 1];
        for (int[] i : dp) Arrays.fill(i, -1);
        int ans = solve(coins, 0, amount);
        return ans==(int)1e6?-1:ans;
    }

    public int solve(int[] coins, int i, int s) {
        if(s==0) return 0;
        if(s<0) return (int)1e6;
        if(i>=coins.length) return (int)1e6;
        if(dp[i][s]!= -1)
            return dp[i][s];
        dp[i][s]=Math.min(solve(coins,i,s-coins[i])+1,solve(coins,i+1,s));
        return dp[i][s];
    }
}
