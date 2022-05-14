class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        List<Pair<Integer,Integer>>[] adj=new ArrayList[n+1];
        int[] duration=new int[n+1];
        Arrays.fill(duration,-1);
        for (int i=0 ;i<n+1 ; i++){
            adj[i] = new ArrayList<>();
        }
        for( int[] a : times){
            int u=a[0] , v=a[1] , w=a[2];
            adj[u].add( new Pair (v,w));
        }
        
        PriorityQueue<Pair<Integer,Integer>> q=new PriorityQueue<>((a,b) -> a.getValue() - b.getValue());
        q.add(new Pair(k,0));
        
        while(!q.isEmpty()){
            Pair<Integer,Integer> p = q.remove();
            int u=p.getKey();
            int wsf=p.getValue();
            if(duration[u]!=-1) continue;
            else duration[u]=wsf;
            for(int i=0;i<adj[u].size();i++){
                if(duration[adj[u].get(i).getKey()] == -1)
                q.add(new Pair(adj[u].get(i).getKey(),wsf+adj[u].get(i).getValue()));
            }
        }
        
        int ans=-1;
        for(int i=1;i<duration.length; i++){
            if(duration[i] == -1) return -1;
          ans=Math.max(ans,duration[i]);  
        }
        return ans;
    }
}