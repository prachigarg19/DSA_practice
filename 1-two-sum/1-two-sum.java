class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(nums[0],0);
        int[] ans=new int[2];
        for(int i=1;i<nums.length;i++){
            if(hm.containsKey(target-nums[i])){
                ans[0] = i;
                ans[1] = hm.get(target-nums[i]);
                return ans;
            }
            hm.put(nums[i],i);
        }
        return ans;
    }
}