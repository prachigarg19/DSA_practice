class Solution {
    int[] dp;
    public int wiggleMaxLength(int[] nums) {
         dp=new int[nums.length];
        Arrays.fill(dp,-1);
        return find(nums, 0, -1, -1001);
    }

    public int find(int[] nums, int ind, int previ, int prevs) {
        if (ind >= nums.length) return 0;
        if (prevs != -1001 && prevs * (nums[ind] - nums[previ]) > 0) return 0;
        if( previ != -1 && nums[ind] == nums[previ]) return 0;
        if(dp[ind]!=-1) return dp[ind];
        int inc = 0, exc = 0;
        if (previ == -1) inc = find(nums, ind + 1, ind, prevs); 
        else inc = find(nums, ind + 1, ind, nums[ind] - nums[previ]);
        exc = find(nums, ind + 1, previ, prevs);
        return dp[ind]=Math.max(inc+1, exc);
    }
}
