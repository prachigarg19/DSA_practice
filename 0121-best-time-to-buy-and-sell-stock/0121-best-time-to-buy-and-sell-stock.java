class Solution {
    public int maxProfit(int[] prices) {
        int[] dp=new int[prices.length];
        int ans=0;
        Arrays.fill(dp,(int)1e6);
        dp[0]=prices[0];
        for(int i=1;i<prices.length;i++){
                dp[i]=Math.min(dp[i-1],prices[i]);
            ans=Math.max(prices[i]-dp[i],ans);
        }
        
        return ans;
    }
}