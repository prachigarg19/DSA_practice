class Solution {
    public int edgeScore(int[] edges) {
       
        long[] in= new long[edges.length];
        for(int i=0;i<edges.length;i++){
            in[edges[i]]+=i;
        }
        int ans=0;
        for(int j=0; j<in.length;j++){
            if(in[j]>in[ans]){
                ans=j;
            }
        }
        return ans;
    }
}