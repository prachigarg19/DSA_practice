class Solution {
    int[][] dp;

    public int uniquePaths(int m, int n) {
        dp = new int[m + 1][n + 1];
        for(int[] i: dp)
            Arrays.fill(i,-1);
        return solve(0, 0, m, n);
    }

    public int solve(int i, int j, int m, int n) {
        if (i == m - 1 && j == n - 1) return 1;
        if (i >= m || j >= n) return 0;
        if (dp[i][j] != -1) return dp[i][j];
        return dp[i][j] = solve(i, j + 1, m, n) + solve(i + 1, j, m, n);
    }
}
