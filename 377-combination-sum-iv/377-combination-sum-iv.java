class Solution {
    int[][] dp;
    public int combinationSum4(int[] nums, int target) {
        dp=new int[nums.length+1][target+1];
        for(int[] i: dp)
        Arrays.fill(i,-1);
        return sum(nums,0, target);
    }
    public int sum(int[] nums,int i, int t){
        if(t<0 || i>=nums.length)
            return 0;
        if(t==0)
            return 1;
        if(dp[i][t]!=-1)
            return dp[i][t];
        int count =0;
        for(int j=0;j<nums.length;j++){
            count += sum (nums, j, t-nums[j]);
        }
        
        return dp[i][t]=count;
        
    }
}