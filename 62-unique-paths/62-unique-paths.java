class Solution {
    int count;
    public int uniquePaths(int m, int n) {
        count=0;
        int visited[][]=new int[m][n];
        visited[0][0]=1;
        int dp[][]=new int[m][n];
       
        return path(0,0,m,n,visited,dp);
    }
    public int path( int i, int j,int m, int n, int[][] visited ,int[][] dp)
    {   if( i==m-1 && j==n-1 ){
            return dp[i][j]=1;
        }
        if(i>=m||j>=n) return 0;
      
        if(dp[i][j]!=0) return dp[i][j];
     return dp[i][j]=path(i,j+1,m,n,visited,dp)+path(i+1,j,m,n,visited,dp);
    }
}