class Solution {
    public int minSetSize(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        
        for(int i: arr){
            hm.put(i, hm.getOrDefault(i,0)+1);
        }
        for(Integer i: hm.values())
            pq.add(i);
        
        int count=0, sum=0;
        while(sum<arr.length/2){
            sum+=pq.poll();
            count++;
        }
        return count;
    }
}