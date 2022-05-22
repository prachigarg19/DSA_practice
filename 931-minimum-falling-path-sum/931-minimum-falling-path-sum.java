class Solution {
    int ans;

    public int minFallingPathSum(int[][] matrix) {
        ans = (int)1e6;
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

    public int per(int i, int j, int[][] matrix, int[][] dp) {
        if (i >= matrix.length || j >= matrix[0].length || i < 0 || j < 0) return Integer.MAX_VALUE;

        if (i == matrix.length - 1) {
            return matrix[i][j];
        }
        if (dp[i][j] != (int)1e6) return dp[i][j];
        int d = (int)1e6, b = (int)1e6, r = (int)1e6;
        if (i + 1 < matrix.length && j + 1 < matrix[0].length) d = per(i + 1, j + 1, matrix, dp);
        if (i + 1 < matrix.length && j - 1 >= 0) b = per(i + 1, j - 1, matrix, dp);
        if (i + 1 < matrix.length) r = per(i + 1, j, matrix, dp);
        return dp[i][j] = Math.min(Math.min(d, b), r) + matrix[i][j];
    }
}
