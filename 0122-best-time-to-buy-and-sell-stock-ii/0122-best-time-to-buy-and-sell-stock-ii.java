class Solution {
    public int maxProfit(int[] prices) {
        int ans=0,profit=0,pos=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>=prices[i-1]){
                ans=Math.max(prices[i]-prices[pos],ans);
            }
            else {
                pos=i;
                profit+=ans;
                ans=0;
            }
        }
        if(ans!=0) profit+=ans;
        return profit;
    }
}