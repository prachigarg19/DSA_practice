class Solution {
    int ans;
    public int longestIncreasingPath(int[][] matrix) {
        ans=0;
        int[][] dp=new int[matrix.length][matrix[0].length];
        // solve(matrix,0,0,dp,-1);
         
        for(int i = 0 ; i<matrix.length ; i++) {
            for(int j = 0 ; j<matrix[0].length ; j++) {
                ans = Math.max(ans , solve(matrix , i , j ,dp, -1));
            }
        }
        return ans;
    }
    public int solve(int[][] matrix,int i,int j,int[][] dp,int ele){
        if(i>=matrix.length||j>=matrix[0].length||i<0||j<0||matrix[i][j]<=ele)
            return 0;
        if(dp[i][j]!=0)
            return dp[i][j];
        dp[i][j]=1+Math.max(Math.max(
            solve(matrix, i + 1, j, dp, matrix[i][j]),
			solve(matrix, i - 1, j, dp, matrix[i][j])),
            Math.max(
			solve(matrix, i, j + 1, dp, matrix[i][j]),
			solve(matrix, i, j - 1, dp, matrix[i][j]) 
        ));
        return dp[i][j];
    }
}