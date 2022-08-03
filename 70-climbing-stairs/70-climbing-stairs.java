class Solution {
    int[] dp;
    public int climbStairs(int n) {
        dp=new int[n+4];
        for(int i=n;i>=0;i--){
            if(i==n){
                dp[i]=1;
                continue;
            }
            if(i>n){
                dp[i] = 0;
                continue;
            }
            if(dp[i]!=0)
                continue;
            dp[i]=dp[i+1]+dp[i+2];
        }
        return dp[0];
    }
}