class Pair {
    int key, value, level;

    Pair(int key, int value, int level) {
        this.key = key;
        this.value = value;
        this.level = level;
    }
}

class Solution {
    int[][] visited;
    int[] row = { -1, 0, 1, 0 };
    int[] col = { 0, 1, 0, -1 };

    public int orangesRotting(int[][] grid) {
        visited = new int[grid.length][grid[0].length];
        int[] ans = new int[1];
        ans[0] = 0;
        for(int[] i: visited)
            Arrays.fill(i,(int)1e6);
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2 && visited[i][j] == (int)1e6) {
                    bfs(grid, i, j, ans);
                }
                if(grid[i][j]==0)
                    visited[i][j]=0;
            }
        }
        int count=0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1 && visited[i][j] == (int)1e6) {
                    return -1;
                }
                ans[0]=Math.max(ans[0],visited[i][j]);
            }
        }
        return ans[0];
    }

    public void bfs(int[][] grid, int r, int c, int[] ans) {
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(r, c, 0));
        while (!q.isEmpty()) {
            Pair p = q.poll();
             visited[p.key][p.value] = p.level;
            for (int i = 0; i < 4; i++) {
                int newrow = p.key + row[i];
                int newcol = p.value + col[i];
                int level = p.level;
               
                if (newrow < 0 || newrow >= grid.length || newcol < 0 || newcol >= grid[0].length) continue;
                if (visited[newrow][newcol] > level+1 && grid[newrow][newcol] == 1) {
                    q.add(new Pair(newrow, newcol,level+1));
                    
                }
            }
        }
    }
}
