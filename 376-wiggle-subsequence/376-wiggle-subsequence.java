class Solution {
    int[] dp;
    public int wiggleMaxLength(int[] nums) {
        int[] up=new int[nums.length];
        int[] down=new int[nums.length];
        up[0]=1;down[0]=1;
        //we are taking first element as the next element decides wether it'll be positive curve or negative curve
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1])
            {   
                //adding current element to the already exisiting down end wiggle
                up[i]=down[i-1]+1;
                down[i]=down[i-1];
                
            }
            else if(nums[i]<nums[i-1])
            {
                down[i]=up[i-1]+1;
                up[i]=up[i-1];
            }
            else{
                //continuinh as it for equal element
                up[i]=up[i-1];
                down[i]=down[i-1];
            }
        }
        //max because the sequence could end in up wiggle or down wiggle and we need the maximum.
        return Math.max(up[nums.length-1],down[nums.length-1]);
    }

   
}
