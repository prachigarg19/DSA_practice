class Solution {
    public int maxProfit(int[] profit) {
        int ans=0,p=profit[0];
        for(int i=1;i<profit.length;i++)
        {
            if(profit[i]<p)
                p=profit[i];
            else{
                ans+=profit[i]-p;
                p=profit[i];
            }
        }
        return ans;
    }
}