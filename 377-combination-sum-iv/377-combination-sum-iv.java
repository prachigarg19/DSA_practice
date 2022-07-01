class Solution {
    int[] dp;
    public int combinationSum4(int[] nums, int target) {
        dp=new int[target+1];
        Arrays.fill(dp,-1);
        return sum(nums,target);
    }
    public int sum(int[] nums,int t){
        
        if(t==0)
            return 1;
        if(dp[t]!=-1)
            return dp[t];
        int count=0;
        for(int j=0;j<nums.length;j++){
            if(t>=nums[j])
            count+=sum(nums,t-nums[j]);
        }
        return dp[t]=count;
    }
}