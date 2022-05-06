class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> al,pre=null;
       for(int i=0;i<numRows;i++)
        {
           al=new ArrayList<>();
           for(int j=0;j<=i;j++)
           {
               if(j==0||j==i)
                   al.add(1);
               else
                   al.add(pre.get(j)+pre.get(j-1));
           }
           pre=al;
           ans.add(al);
        }
        return ans;
    }
}