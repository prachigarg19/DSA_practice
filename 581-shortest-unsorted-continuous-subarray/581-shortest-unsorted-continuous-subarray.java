class Solution {
    public int findUnsortedSubarray(int[] nums) {
        boolean flag=false;
        int count=0,start=nums.length,end=-1,j;
        for(int i=0;i<nums.length;i++)
        {   flag=false;
            for(j=i+1;j<nums.length;j++)
            {
                if(nums[j]<nums[i])
                {   
                    flag=true;
                    end=Math.max(end,j);
                }
            }
            if(flag==true) {
            start=Math.min(start,i);
            
            }
        }
        if(start==nums.length||end==-1) return 0;
        return end-start+1;
    }
} 