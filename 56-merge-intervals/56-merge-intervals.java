class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList<List<Integer>> temp=new ArrayList<>();
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int start=intervals[0][0],end=intervals[0][1];
        for(int i=1;i<intervals.length;i++)
        {
            if(end>=intervals[i][0])
            {
                start=Math.min(intervals[i-1][0],start);
                end=Math.max(intervals[i][1],end);
            }
            else{
              List<Integer> al=new ArrayList<>();
                al.add(start);
                al.add(end);
                temp.add(al);
                start=intervals[i][0];
                end=Math.max(intervals[i][1],end);
            }
        }
         List<Integer> al=new ArrayList<>();
                al.add(start);
                al.add(end);
                temp.add(al);
        int[][] ans=new int[temp.size()][2];
        for(int i=0;i<temp.size();i++)
        {
            ans[i][0]=temp.get(i).get(0);
            ans[i][1]=temp.get(i).get(1);
        }
        return ans;
    }
}