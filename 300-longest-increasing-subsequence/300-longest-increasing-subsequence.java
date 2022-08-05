class Solution {
    int[][] dp;
    public int lengthOfLIS(int[] nums) {
        dp=new int[nums.length+1][nums.length+1];
        for(int[] i: dp)
        Arrays.fill(i,-1);
        return solve(nums,0,-1);
    }
    public int solve(int[] nums,int i,int pi){
       
        // if(nums[i]<=nuprev) return 0;
        if(i>=nums.length)
            return 0;
        if(pi!=-1 && dp[i][pi]!=-1)
            return dp[i][pi];
        int inc=0;
        if(pi==-1 || nums[i]>nums[pi]){
            inc = solve(nums, i+1, i)+1;
        }
        int exc = solve(nums, i+1, pi);
        if(pi!=-1) dp[i][pi]=Math.max(inc,exc);
        return Math.max(inc,exc);
    }
}