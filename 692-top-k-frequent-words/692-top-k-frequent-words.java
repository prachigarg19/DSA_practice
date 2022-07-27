class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> hm=new HashMap<>();
        //storing only key while mantaning order using value
        PriorityQueue<String> pq=new PriorityQueue<>(
            (a,b)->hm.get(a)==hm.get(b)?b.compareTo(a):hm.get(a)-hm.get(b));
        for(String i:words){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        for( String s: hm.keySet()){
            pq.add(s);
            while(pq.size()>k)
               pq.remove(); 
        }
        List<String> ans= new ArrayList<>();
        while(k-->0){
            ans.add(pq.poll());
        }
       Collections.reverse(ans);
        return ans;
    }
}