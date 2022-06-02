class Solution {
    int count;
    public int uniquePaths(int m, int n) {
        count=0;
        int dp[][]=new int[m+1][n+1];
       
        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                if( i==m-1 && j==n-1 ){
                    dp[i][j]=1;
                    continue;
                }
                 
      
                if(dp[i][j]!=0) continue;
                dp[i][j]=dp[i][j+1]+dp[i+1][j];
            }
        }
        return dp[0][0];
    }
    
}