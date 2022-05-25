class Solution {
    int dp[][];

    public int findTargetSumWays(int[] nums, int target) {
        
        //t<0 while calculating, to solve this we add sum of all values(const) to keep it positive
        int sum = 0;
        for (int i = 0; i < nums.length; i++) sum += nums[i];
        dp = new int[nums.length + 1][2*sum + 1];
        return per(nums, 0, sum, sum - target);
        
    }

    public int per(int[] nums, int i, int t, int val) {
        if (i == nums.length) {
          
            if (t == val) {
                return 1;
            } else return 0;
        }
        
        // if(t>dp) return 0;
        
        if (dp[i][t] != 0) return dp[i][t];

        return dp[i][t] = per(nums, i + 1, t - nums[i], val) + per(nums, i + 1, t + nums[i], val);
    }
}
