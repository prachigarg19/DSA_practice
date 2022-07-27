class Solution {
    public int minSetSize(int[] arr) {
        HashMap<Integer,Integer> hm= new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        for(int i: arr){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        for(Integer i: hm.values()){
            pq.add(i);
        }
        int sum=0,count=0;
        while(sum<arr.length/2){
            if(pq.size()==0) break;
            sum+=pq.poll();
            count++;
        }
        return count;
    }
}