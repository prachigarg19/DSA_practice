class Solution {

    public int removeElement(int[] nums, int val) {
        int i = 0, j = 0;
        while (j < nums.length) {
            if (nums[j] != val) {
                int item = nums[i];
                nums[i] = nums[j];
                nums[j] = item;
                i++;
                j++;
            } else j++;
        }
        return i;
    }
}
