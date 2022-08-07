class Solution {
    int[][] dp;
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i: nums)
            sum+=i;
        if(sum%2!=0) return false;
        dp=new int[nums.length+1][sum/2+1];
         for(int[] o: dp)
            Arrays.fill(o,-1);
        for(int i=0;i<dp.length;i++)
            dp[i][0]=1;
        for(int j=0;j<dp[0].length;j++)
            dp[0][j]=0;
        dp[0][0]=1;
        for(int i=1;i<dp.length-1;i++){
            for(int j=1;j<=sum/2;j++){
               
                if(dp[i][j]!=-1)
                    continue;
                if(j-nums[i]>=0)
                dp[i][j] = dp[i-1][j-nums[i]]|dp[i-1][j];
                else 
                    dp[i][j] = dp[i-1][j];
                
            }
         }
        // for( int i=0;i<dp.length;i++){
        //     for(int j=0;j<dp[0].length;j++)
        //         System.out.print(dp[i][j]+" ");
        //     System.out.println();
        // }
        return dp[nums.length-1][sum/2]==1?true:false;
    }
}