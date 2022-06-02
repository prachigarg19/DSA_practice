class Solution {
    int count;
    public int uniquePaths(int m, int n) {
        count=0;
        int dp[][]=new int[m][n];
       
        return path(0,0,m,n,dp);
    }
    public int path( int i, int j,int m, int n, int[][] dp)
    {   if( i==m-1 && j==n-1 ){
            return dp[i][j]=1;
        }
        if(i>=m||j>=n) return 0;
      
        if(dp[i][j]!=0) return dp[i][j];
     return dp[i][j]=path(i,j+1,m,n,dp)+path(i+1,j,m,n,dp);
    }
}