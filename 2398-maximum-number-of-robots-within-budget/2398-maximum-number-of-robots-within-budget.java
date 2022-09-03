class Solution {
    public int maximumRobots(int[] chargeTimes, int[] runningCosts, long budget) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        int s=0,ans=0;
        long sum=0;
        for(int i=0;i<chargeTimes.length;i++){
            sum+=runningCosts[i];
            pq.add(chargeTimes[i]);
            long val=(long)pq.peek()+(long)(i-s+1)*sum;
            while(s<=i && val>budget){
                sum-=runningCosts[s];
                pq.remove(chargeTimes[s]);
                if(!pq.isEmpty())
                val=(long)pq.peek()+(long)(i-s+1)*sum;
                s++;
            }
            ans=Math.max(ans,i-s+1);
        }
        return ans;
    }
}