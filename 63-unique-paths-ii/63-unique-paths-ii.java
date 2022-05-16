class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        int dp[][]=new int[grid.length][grid[0].length];
        if(grid[0][0]==1||grid[grid.length-1][grid[0].length-1]==1) return 0;
        return permute(0,0,dp,grid,grid.length,grid[0].length);
    }
    public int permute(int i,int j,int[][] dp, int[][] grid,int m,int n){
        
        if(i==m-1&&j==n-1)
            return dp[i][j]=1;
        if(i>=m||j>=n)
            return 0;
        if(dp[i][j]!=0) return dp[i][j];
        if(grid[i][j]==1) return 0;
        return dp[i][j]=permute(i,j+1,dp,grid,m,n)+permute(i+1,j,dp,grid,m,n);
    }
}