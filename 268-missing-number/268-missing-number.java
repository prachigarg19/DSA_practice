class Solution {
    public int missingNumber(int[] nums) {
        // if(nums.length==1) return nums[nums.length-1]==0?1:
        int sum=0;
       for(int i=0;i<nums.length;i++)
           sum+=nums[i];
        
        int n=nums.length;
        return n*(n+1)/2 - sum;
    }
}

//1+2+3=6
//1+0+3=4