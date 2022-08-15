class Solution {
    int dp[][];
    public int maxProfit(int[] prices) {;
        dp=new int[prices.length][2];
        for(int[] i: dp)
            Arrays.fill(i,-1);
        int ans = solve(prices,0,1);
        return ans<0?0:ans;
    }
    public int solve( int[] p, int i, int op){
        if(i>=p.length)
            return 0;
        if(dp[i][op]!=-1)
            return dp[i][op];
        //sell
        if(op==0)
            return dp[i][op] = Math.max(solve(p,i+2,1)+p[i],solve(p,i+1,0));
        //buy
        if(op==1)
            return dp[i][op] = Math.max(solve(p,i+1,0)-p[i],solve(p,i+1,1));
        return dp[i][op];
    }
}