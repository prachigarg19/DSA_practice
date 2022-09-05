class Pair{
    int row,col;
    Pair(int row, int col){
        this.row=row;
        this.col=col;
    }
}
class Solution {
    public int shortestBridge(int[][] grid) {
        
        //logic- we will add all the 1s of first island and find all zeroes from them.
        // we will keep on increasing level till I find UNVISITED 1 as it would mean that we have reached second island using minumum flips as we are using 2 loop bfs.
        
        //storing first island
        
        int m=grid.length,n=grid[0].length;
        int[][] visited=new int[m][n];
        Queue<Pair> q=new LinkedList<>();
        boolean flag=false;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    dfs(i,j,grid,q,visited);
                   flag=true;
                    break;
                }
            }
            if(flag) break;
        }
        
        int level=0;
        int[] row={-1,0,0,1};
        int[] col={0,-1,1,0};
        // while(!q.isEmpty()){
        //     System.out.println(q.peek().row+" "+q.poll().col);
        // }
        while(!q.isEmpty()){
            int size=q.size();
            level++;
            while(size-->0){
                int r=q.peek().row;
                int c=q.poll().col;
                for(int k=0;k<4;k++){
                    int i=r+row[k];
                    int j=c+col[k];
                    if(i<0 || i>=grid.length || j<0 || j>=grid[0].length) continue;
                    if(grid[i][j]==1 && visited[i][j]==0){
                       return level-1;
                    }
                    if(grid[i][j]==0 && visited[i][j]==0){
                        q.add(new Pair(i,j));
                        visited[i][j]=1;
                    }
                }
            }
        }
        return -1;
        
        
    }
    
    public void dfs(int i, int j, int[][] grid, Queue<Pair> q, int[][] visited){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length) return;
        if(grid[i][j]==0 || visited[i][j]!=0) return;
        q.add(new Pair(i,j));
        visited[i][j]=1;
        dfs(i-1,j,grid,q,visited);
        dfs(i+1,j,grid,q,visited);
        dfs(i,j-1,grid,q,visited);
        dfs(i,j+1,grid,q,visited);
    }
}