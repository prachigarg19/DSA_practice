class Solution {
    int[][] dp;

    public int minimumTotal(List<List<Integer>> triangle) {
        dp = new int[triangle.size() + 3][triangle.get(triangle.size() - 1).size() + 3];
        for (int i = 0; i < dp.length; i++) Arrays.fill(dp[i], (int) 1e6);

        for (int r = triangle.size(); r >= 0; r--) {
            for (int c = triangle.get(triangle.size() - 1).size() - 1; c >= 0; c--) {
                if (r == triangle.size()) {
                    dp[r][c] = 0;
                    continue;
                }

                if (dp[r][c] != (int) 1e6) continue;
                if (c >= triangle.get(r).size()) continue;
                dp[r][c] = Math.min(dp[r + 1][c], dp[r + 1][c + 1]) + triangle.get(r).get(c);
            }
        }
        return dp[0][0];
    }
}
