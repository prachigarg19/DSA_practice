class Solution {

    public int removeDuplicates(int[] nums) {
        int i = 0, j = 0, count = 0;
        while (j < nums.length) {
            int ele = nums[j];
            while (j < nums.length && nums[j] == ele) {
                count++;
                if (count <= 2) {
                    int item = nums[i];
                    nums[i] = nums[j];
                    nums[j] = item;
                    i++;
                    j++;
                } else j++;
            }
            count = 0;
        }
        return i;
    }
}
