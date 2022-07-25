class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        PriorityQueue<Character> pq= new PriorityQueue<>((a,b)->hm.get(b)-hm.get(a));
        for(int i=0;i<s.length();i++)
        {
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }
        for(Character c: hm.keySet())
            pq.add(c);
        
        String ans="";
        while(pq.size()!=0)
        {
            int count=hm.get(pq.peek());
            while(count-->0)
                ans+=pq.peek();
            pq.remove();
        }
        return ans;
    }
}