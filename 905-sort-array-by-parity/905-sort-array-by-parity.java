class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i=0,j=0,k=nums.length-1;
        while(i<k)
        {
            if(nums[j]%2==0)
            {swap(nums,i,j);
             i++; j++;
            }
            else {
                swap(nums,j,k);
                k--;
            }
        
        }
        return nums;
    }
    public void swap(int[] nums,int i,int j)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}