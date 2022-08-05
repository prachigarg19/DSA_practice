class Solution {
    int[][] dp;
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i: nums){
            sum+=i;
        }
        if(sum%2!=0) return false;
        dp=new int[nums.length+1][sum/2+1];
        for(int[] o: dp)
            Arrays.fill(o,-1);
        return solve(nums, 0, sum/2) == 1? true: false;
    }
    public int solve( int[] nums, int i, int sum){
        if(sum == 0)
            return 1;
        if(sum < 0)
            return 0;
        
        if(i>=nums.length)
            return 0;
        if(dp[i][sum]!=-1)
            return dp[i][sum];
        return dp[i][sum]=solve(nums,i+1,sum-nums[i])|solve(nums,i+1,sum);
    }
}