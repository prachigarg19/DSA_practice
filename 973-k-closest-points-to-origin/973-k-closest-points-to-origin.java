class pair{
    int key;
    int value;
    pair(int key, int value){
        this.key=key;
        this.value=value;
    }
}
class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int[][] ans = new int[k][2];
        PriorityQueue<pair> pq=new PriorityQueue<>((a,b)->b.value-a.value);
        for(int i=0;i<points.length;i++){
            pq.add(new pair(i,points[i][0]*points[i][0]+points[i][1]*points[i][1]));
            if(pq.size()>k)
                pq.remove();
        }
        while(--k>=0)
        {
            pair p=pq.poll();
            ans[k][0] = points[p.key][0];
            ans[k][1]= points[p.key][1];
        }
        return ans;
    }
}