class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length , n=grid[0].length;
         int dp[][]=new int[m][n];
       
        return path(0,0,m,n,dp,grid);
    }
     public int path( int i, int j,int m, int n,int[][] dp,int[][] grid)
    {   if( i==m-1 && j==n-1 ){
            return grid[i][j];
        }
        if(i>=m||j>=n) return Integer.MAX_VALUE;
      
        if(dp[i][j]!=0) return dp[i][j];
     return dp[i][j]=grid[i][j]+Math.min(path(i,j+1,m,n,dp,grid),path(i+1,j,m,n,dp,grid));
    }
}