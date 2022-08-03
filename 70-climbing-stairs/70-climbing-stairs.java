class Solution {
    int[] dp;
    public int climbStairs(int n) {
        dp=new int[n];
        return solve(n,0);
    }
    public int solve(int n, int i){
        if(i==n)
            return 1;
        if(i>n)
            return 0;
        if(dp[i]!=0)
            return dp[i];
        return dp[i]=solve(n,i+1)+solve(n,i+2);
    }
}