class Solution {
    int[] dp;
    public int minCostClimbingStairs(int[] cost) {
        dp=new int[cost.length+2];
        
        // 0 10 15 20 ( 0 + 1 jump gives 0+rec(10))
        // 0 10 15 20 ( 0 + 2 jumps gives 0+rec(15))
        // final answer returned = min( 0 +rec(10), 0 +rec(15))
        
        //O(1) time-> append 0 at last and start from last index
        
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
