class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans=0;
        int j=0,count=0;
        while(j<nums.length){
            
            if(nums[j]==0){
                j++;
                continue;
            }
            while(j<nums.length && nums[j]==1){
                count++;
                j++;
            }
            ans=Math.max(count,ans);
            count=0;
            
        }
        return ans;
    }
}