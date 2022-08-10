class Solution {
    public boolean isBipartite(int[][] graph) {
        int[] visited = new int[graph.length];
        for(int i=0;i<graph.length;i++){
            if(visited[i]!=0) continue;
            if(!dfs(graph,i, visited, 1))
                return false;
        }
        return true;
    }
    
    public boolean dfs(int[][] graph, int u, int[] visited, int c){
        visited[u] = c;
        for(int i: graph[u]){
            if(visited[i]==0){
                if(!dfs(graph,i,visited,-c))
                    return false;
            } 
            else if( visited[i] == visited[u])
                return false;
        }
        return true;
    }
}