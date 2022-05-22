class Solution {
   

    public int minFallingPathSum(int[][] matrix) {
        int ans = (int)1e6;
        int dp[][] = new int[matrix.length + 1][matrix[0].length + 1];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) 
                dp[i][j] = (int)1e6;
        }
        for (int j = 0; j < matrix[0].length; j++) {
            ans = Math.min(per(0, j, matrix, dp), ans);
            // System.out.println(dp[0][j]);
        }
        return ans;
    }

    int per(int i, int j, int[][] matrix, int[][] dp) {
        // if (i >= matrix.length || j >= matrix[0].length || i < 0 || j < 0) return Integer.MAX_VALUE;

        if (i == matrix.length - 1) {
            return matrix[i][j];
        }

        if (dp[i][j] != (int)1e6) return dp[i][j];

        int x = (int)1e6;

        for (int k = 0; k < matrix[0].length; k++) {
            if (k == j) continue;
            x = Math.min(per(i + 1, k, matrix, dp) + matrix[i][j], x);
        }
        return dp[i][j] = x;
    }
}
