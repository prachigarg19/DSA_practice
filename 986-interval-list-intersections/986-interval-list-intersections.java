class Solution {
    public int[][] intervalIntersection(int[][] fl, int[][] sl) {
         ArrayList<List<Integer>> temp=new ArrayList<>();
        int i=0,j=0;
        while(i<fl.length&&j<sl.length)
        { List<Integer> al=new ArrayList<>();
            if((fl[i][0]>=sl[j][0]&&fl[i][0]<=sl[j][1])
                ||(sl[j][0]>=fl[i][0]&&sl[j][0]<=fl[i][1]))
            {
                al.add(Math.max(fl[i][0],sl[j][0]));
                al.add(Math.min(fl[i][1],sl[j][1]));
                temp.add(al);
            }
            if(fl[i][1]>sl[j][1]) j++;
            else i++;
        }
         int[][] ans=new int[temp.size()][2];
        for(i=0;i<temp.size();i++)
        {
            ans[i][0]=temp.get(i).get(0);
            ans[i][1]=temp.get(i).get(1);
        }
        return ans;
    }
}