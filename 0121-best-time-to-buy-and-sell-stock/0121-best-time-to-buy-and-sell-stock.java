class Solution {
    public int maxProfit(int[] prices) {
        int[] dp=new int[prices.length];
        int ans=0,pos=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<prices[pos])
                pos=i;
            ans=Math.max(prices[i]-prices[pos],ans);
        }
        
        return ans;
    }
}