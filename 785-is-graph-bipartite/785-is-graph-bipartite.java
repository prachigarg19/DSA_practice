class Solution {
    public boolean isBipartite(int[][] graph) {
        int[] visited = new int[graph.length];
        for(int i=0;i<graph.length;i++){
            if(visited[i]!=0) continue;
            if(!bfs(graph,i, visited))
                return false;
        }
        return true;
    }
    
    public boolean bfs(int[][] graph, int u, int[] visited){
        Queue<Integer> q =new LinkedList<>();
        q.add(u);
        visited[u] =1;
        while(!q.isEmpty()){
            int v = q.poll();
            for(int i: graph[v]){
                if(visited[i]==0){
                    q.add(i);
                    visited[i] = -1*visited[v];
                }
                else if(visited[i]*visited[v]==1)
                    return false;
            }
        }
        return true;
    }
}