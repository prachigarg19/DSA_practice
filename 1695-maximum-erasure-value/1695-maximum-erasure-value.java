class Solution {

    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int ans=-1,sum=0;
        for(int i=0,j=0;j<nums.length;){
            if(!set.contains(nums[j]))
            {
                sum+=nums[j];
                set.add(nums[j]);
                j++;
            }
            else{
                sum-=nums[i];
                set.remove(nums[i]);
                i++;
            }
            ans=Math.max(ans,sum);
        }
        return ans;
    }
}
