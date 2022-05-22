class Solution {
    int[] dp;
    public int minCostClimbingStairs(int[] cost) {
        dp=new int[cost.length+2];
//         int dp[] = new int[cost.length+1];
//         dp[cost.length-1]=cost[cost.length-1];
//         int ans = Integer.MAX_VALUE;
//         for(int i=cost.length-2;i>=0;i--){
            
//             dp[i]=Math.min(dp[i+1],dp[i+2])+cost[i];
            
//             ans=Math.min(ans,dp[i]);
//         }
//        return ans; 
        int[] cost2=new int[cost.length+1];
        cost2[0]=0;
        for(int i=0;i<cost.length;i++)
            cost2[i+1]=cost[i];
        return rec( 0, cost2.length, cost2)  ;
    }
    
    public int rec( int i, int n, int[] cost){
        
        if(i == n ){
            return 0;
        }
        if(i > n ||  i >= n)
            return Integer.MAX_VALUE;
        if(dp[i]!=0 ) return dp[i];
        return dp[i]=Math.min(rec(i+1,n, cost) , rec(i+2, n, cost)) + cost[i];
    }
}
