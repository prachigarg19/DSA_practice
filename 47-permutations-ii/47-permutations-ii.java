class Solution {
    List<List<Integer>> ans;
    // HashMap<List<Integer>>
    public List<List<Integer>> permuteUnique(int[] b) {
        ans=new ArrayList<>();
        permute(b,0);
        String str="";
        return ans;
    }
      public void permute(int[] b,int index)
    {
        if(index==b.length)
        {
            List<Integer> al=new ArrayList<>();
            for(int i=0;i<b.length;i++)
                al.add(b[i]);
            if(!ans.contains(al))
            ans.add(al);
            return;
        }
        for(int i=index;i<b.length;i++)
        {   
            swap(b,i,index);
            permute(b,index+1);
            swap(b,i,index);
        }
    }
    public void swap(int[] nums,int i,int j)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}