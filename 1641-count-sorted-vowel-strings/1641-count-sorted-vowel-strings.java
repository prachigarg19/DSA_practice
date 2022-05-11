class Solution {

    public int countVowelStrings(int n) {
       int[][] dp=new int[n+1][6];
       int ans=solve(dp,n,5);
        return ans;
    }
    
    public int solve(int[][] dp , int n , int t)
    {
        if(n==1)
            return dp[n][t]=t;
        if(t==1)
            return dp[n][t]=1;
        if(dp[n][t]!=0)
            return dp[n][t];
        
        //inc (a) a,e,i,o,u
        //exc(a) e,i,o,u
        int inc=solve(dp, n-1 ,t);
        int exc=solve(dp, n, t-1);
        return dp[n][t]=inc+exc;
    }
}