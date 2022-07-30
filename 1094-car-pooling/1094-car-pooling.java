class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int p=0;
        int size=0;
        for(int[] t: trips){
            size=Math.max(size,t[2]);
        }
        int count[] = new int[size+1];
        for(int[] t: trips){
            count[t[1]] += t[0];
            count[t[2]] -= t[0];
        }
        for(int i=0;i<size+1;i++){
            p+=count[i];
            if(p>capacity)return false;
        }
        return true;
    }
}