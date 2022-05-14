class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        List<List<Integer>> ans=new ArrayList<>();
       Arrays.sort( nums );
        for(int i=0;i<nums.length-3;i++){
            if(i!=0 && nums[i] == nums[i-1]) 
                continue;
            for(int j=i+1;j<nums.length-2;j++){
                if(j!=i+1 && nums[j-1]==nums[j])
                    continue;
                for(int k=j+1;k<nums.length-1;k++){
                 if(k!=j+1 && nums[k-1]==nums[k])
                    continue;
                int l=k+1,h=nums.length-1;
                while(l<=h){
                    int mid=l+(h-l)/2;
                    if(nums[mid]+nums[i]+nums[j]+nums[k]==target)
                    {
                        List<Integer> al=new ArrayList<>();
                        al.add(nums[i]);
                        al.add(nums[j]);
                        al.add(nums[k]);
                        al.add(nums[mid]);
                        ans.add(al);
                        break;
                    }
                    else if(nums[mid]+nums[i]+nums[j]+nums[k] < target)
                        l=mid+1;
                    else h=mid-1;
                }
            }
        }
    }
   return ans;
    }
}