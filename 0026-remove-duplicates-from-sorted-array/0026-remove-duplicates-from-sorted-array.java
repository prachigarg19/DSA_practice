class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0,j=0;
        while(j<nums.length){
            while(j<nums.length && nums[i]==nums[j]){
                j++;
            }
            if(i+1<nums.length && j<nums.length)
            {int temp=nums[i+1];
            nums[i+1]=nums[j];
            nums[j]=temp;
            i++;
            }
            j++;
        }
        return i+1;
    }
}