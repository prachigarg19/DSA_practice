class Solution {

    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        int excend = find(nums, 0, nums.length - 1);
        int excstart = find(nums, 1, nums.length );
        return Math.max(excstart, excend);
    }

    public int find(int[] nums, int start, int end) {
        int next = 0, next2 = 0, curr = 0;
        for (int i = end; i >= start; i--) {
            if (i == end) {
                continue;
            }

            curr = Math.max(next2 + nums[i], next);
            next2 = next;
            next = curr;
        }
        return curr;
    }
}
