class Solution {
    public int findCircleNum(int[][] isConnected) {
        HashMap<Integer,List<Integer>> hm=new HashMap<>();
        for(int i=0;i<isConnected.length;i++)
            hm.put(i,new ArrayList<>());
        
        for(int i=0;i<isConnected.length;i++){
            for(int j=0;j<=i;j++){
                if(isConnected[i][j]==1)
                    addEdge(hm,i,j);
            }
        }
        int count=0;
        int[] visited=new int[isConnected.length];
        for(int i=0;i<isConnected.length;i++){
            if(visited[i]==0){
                count++;
                dfs(hm,i,visited);
            }
        }
        return count;
    }
    public void addEdge(HashMap<Integer,List<Integer>> hm, int u, int v){
       hm.get(u).add(v);
        hm.get(v).add(u);
    }
    public void dfs(HashMap<Integer,List<Integer>> hm, int i,int[] visited){
        visited[i]=1;
        for(Integer t: hm.get(i)){
            if(visited[t]==0)
                dfs(hm,t,visited);
        }
    }
}