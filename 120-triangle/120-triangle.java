class Solution {
    int[][] dp;

    public int minimumTotal(List<List<Integer>> triangle) {
        dp = new int[triangle.size() + 1][triangle.get(triangle.size() - 1).size() + 1];

        for (int i = 0; i < triangle.size(); i++) {
            for (int j = 0; j < triangle.get(triangle.size() - 1).size(); j++) 
                dp[i][j] = (int) 1e6;
        }
        return sum(0, 0, triangle);
    }

    public int sum(int i, int j, List<List<Integer>> triangle) {
        if (j == triangle.size()) {
            return 0;
        }

        if (dp[i][j] != (int) 1e6) return dp[i][j];

        return dp[i][j] = Math.min(sum(i, j + 1, triangle), sum(i + 1, j + 1, triangle)) + triangle.get(j).get(i);
    }
}
