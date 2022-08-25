class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        //1. more than one dfs call
        //2. prev=current parent node. This means presence of undirected edge
        //6->9 , 9-> 6
        int[] visited = new int[rooms.size()];
        int count=0;
        // for(int i=0;i<rooms.size();i++){
            // if(visited[i]==0){
                // visited[i]=1;
                dfs(0, rooms, visited);
            // }
        // }
        for(int i=1;i<visited.length;i++){
            System.out.print(visited[i]+" ");
            if(visited[i]==0) return false;
        }
        return true;
    }
    public void dfs(int node, List<List<Integer>> rooms, int[] visited){
        visited[node]=1;
        for(Integer it: rooms.get(node)){
            if(it!=node && visited[it]==0){
                // visited[it]=1;
                dfs(it, rooms, visited);
            }
        }
    }
}