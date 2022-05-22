class Solution {
    public int climbStairs(int n) {
        int dp[] = new int[n+1];
        solve(n, dp);
        return dp[n];
    }
    public int solve(int n, int[] dp){
     
        if(n==0)
            return 1;
        if(n < 0)
            return 0;
        if(dp[n]!=0) return dp[n];
        
        for(int i=1; i<=2; i++){
            dp[n]+=solve(n-i, dp);
        }
        return dp[n];
    }
}