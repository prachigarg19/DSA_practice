class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result=new int[nums.length];
//         for(int i=0;i<nums.length;i++)
//         {
//             nums[i]=nums[i]*nums[i];
//         }
//         int i=0,j=nums.length-1;
//         while(i<j)
//         {
//             if(nums[i]>nums[j])
//             {
//                 int temp=nums[i];
//                 nums[i]=nums[j];
//                 nums[j]=temp;
                
//             }
//             else i++;
//            j--;
//         }
        int p=0;
        for(int i=0;i<nums.length;i++)
        {
          if(nums[i]>0)
          {
              p=i;
              break;
          }
            else nums[i]=-nums[i];
        }
        int i=0,j=nums.length-1,k=nums.length-1;
        while(i<=j)
        {
            if(nums[i]<nums[j])
            {
                result[k--]=nums[j]*nums[j];
                j--;
            }
            else 
            {
                result[k--]=nums[i]*nums[i];
                i++;
            }
        }
        return result;
    }
}