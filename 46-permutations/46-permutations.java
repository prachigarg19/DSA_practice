class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> permute(int[] b) {
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