
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        //storing only key while mantaning order using value
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->hm.get(b)-hm.get(a));
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        for( Integer s: hm.keySet()){
            pq.add(s);
        }
        int[] ans=new int[k];
        while(k-->0){
            ans[k]=pq.poll();
        }
        return ans;
    }
}