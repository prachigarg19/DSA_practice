class Solution {
    int[] dp;

    public int minCostClimbingStairs(int[] cost) {
        dp = new int[cost.length + 3];

        // 0 10 15 20 ( 0 + 1 jump gives 0+rec(10))
        // 0 10 15 20 ( 0 + 2 jumps gives 0+rec(15))
        // final answer returned = min( 0 +rec(10), 0 +rec(15))

        //O(1) time-> append 0 at last and start from last index

        int[] cost2 = new int[cost.length + 1];
        cost2[0] = 0;
        for (int i = 0; i < cost.length; i++) cost2[i + 1] = cost[i];
        int n = cost2.length;
        for (int i = cost2.length+1; i >= 0; i--) {
            if (i == n) {
                dp[i] = 0;
                continue;
            }
            if (i > n) {
                dp[i] = Integer.MAX_VALUE;
                continue;
            }
            dp[i] = Math.min(dp[i + 1], dp[i + 2]) + cost2[i];
        }
        return dp[0];
    }
}
