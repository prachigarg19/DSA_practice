class Solution {
    int[][] visited;
    int[] rows={-1,0,0,1};
    int[] columns={0,-1,1,0};
    public int numEnclaves(int[][] grid) {
        visited = new int[grid.length][grid[0].length];
        int m = grid.length, n = grid[0].length;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1 && (i==0 || j==0 || i==m-1 || j==n-1)) dfs(grid, i, j);
            }
        }
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) count++;
            }
        }
        return count;
    }

    public void dfs(int[][] grid, int i, int j) {
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]==0)
            return;
       grid[i][j] = 0;
        for (int k = 0; k < 4; k++) {
            int new_r = i + rows[k];
            int new_c = j + columns[k];
            dfs(grid, new_r, new_c);
        }
    }
}
