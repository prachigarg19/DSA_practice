class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        PriorityQueue<Integer> pq
            = new PriorityQueue<Integer>(
                Collections.reverseOrder());
        for(int i=0;i<nums.length;i++)
            pq.add(nums[i]);
        int count=k-1;
        while(count-->0){
            pq.remove();
        }
        return pq.peek();
    }
}