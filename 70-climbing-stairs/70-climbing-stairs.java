class Solution {
    int[] dp;
    public int climbStairs(int n) {
        dp=new int[n+1];
        Arrays.fill(dp,-1);
        return per(n);
    }
    public int per( int n){
        if(n==1 || n==2) return n;
        
        if(n<=0) return 0;
        
        if(dp[n]!=-1) return dp[n];
        
        return dp[n] = per(n-1)+per(n-2);
    }
}