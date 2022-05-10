class Solution {
    List<String> ans;
    public void nextPermutation(int[] nums) {
        int ind1=0,ind2=nums.length;
        for(int i=nums.length-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                ind1=i;
                break;
            }
        }
        
        for(int i=nums.length-1;i>=0;i--)
        {
            if(nums[i]>nums[ind1])
            {
                ind2=i;
                break;
            }
        }
        if(ind1==0&&ind2==nums.length)
        {
            int i=0,j=nums.length-1;
            while(i<=j)
            {
                swap(nums,i,j);
                i++;
                j--;
            }
            return;
        }
        swap(nums,ind1,ind2);
        int i=ind1+1,j=nums.length-1;
        while(i<=j)
        {
            swap(nums,i,j);
            i++;
            j--;
        }
    }
    void swap(int[] a,int i,int j)
    {
        //swap values
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}