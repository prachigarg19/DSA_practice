class Solution {
    int[] dp;
    public int minCostClimbingStairs(int[] cost) {
        dp=new int[cost.length+1];
        Arrays.fill(dp,(int)1e6);
        int ind0= solve(cost, 0);
        Arrays.fill(dp,(int)1e6);
        int ind1=solve(cost, 1);
        return Math.min(ind0, ind1);
        
    }
    public int solve(int[] cost, int i){
        if(i==cost.length)
            return 0;
        if(i>cost.length)
            return (int)1e6;
        if(dp[i]!=(int)1e6)
            return dp[i];
        return dp[i] = Math.min(solve(cost, i+1), solve(cost, i+2))+ cost[i];
    }
}