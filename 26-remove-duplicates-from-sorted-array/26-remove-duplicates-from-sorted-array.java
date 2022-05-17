class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0,j=0;
        while( j< nums.length){
            int ele=nums[j];
            while(j<nums.length&&nums[j] == ele){
                j++;
            }
            nums[i] = ele;
            i++;
        }
        return i;
    }
}