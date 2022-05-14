class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
       List<List<Integer>> ans=new ArrayList<>();
       Arrays.sort( nums );
        for(int i=0;i<nums.length-2;i++){
            if(i!=0 && nums[i] == nums[i-1]) 
                continue;
            for(int j=i+1;j<nums.length-1;j++){
                if(j!=i+1 && nums[j-1]==nums[j])
                    continue;
                int l=j+1,h=nums.length-1;
                while(l<=h){
                    int mid=l+(h-l)/2;
                    if(nums[mid]+nums[i]+nums[j]==0)
                    {
                        List<Integer> al=new ArrayList<>();
                        al.add(nums[i]);
                        al.add(nums[j]);
                        al.add(nums[mid]);
                        ans.add(al);
                        break;
                    }
                    else if(nums[mid]+nums[i]+nums[j] < 0)
                        l=mid+1;
                    else h=mid-1;
                }
            }
        }
    
   return ans;
  }
}