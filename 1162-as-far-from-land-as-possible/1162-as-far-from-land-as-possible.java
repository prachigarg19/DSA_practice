class Pair{
    int row,col;
    Pair(int row, int col){
        this.row=row;
        this.col=col;
    }
}
class Solution {
    public int maxDistance(int[][] grid) {
        int ans=0;
        int m=grid.length, n=grid[0].length;
        Queue<Pair> q= new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1)
                    q.add(new Pair(i,j));
            }
        }
        
        int[] row={-1,0,0,1};
        int[] col={0,-1,1,0};
        //storing all ones will lead to assigning 1 to all zeroes in the first iteration, thus no need to check if smaller can be found than current assigned value.
        if(q.isEmpty()) return -1;
        if((long)q.size()==(long)m*n) return -1;
        while(!q.isEmpty()){
            int size=q.size();
            ans++; //for a particular iteration level will be same.
            while(size-->0){
            Pair p=q.poll();
            int r=p.row;
            int c=p.col;
            for(int i=0;i<4;i++){
                int new_r=r+row[i];
                int new_c=c+col[i];
                if(new_r<0 || new_r>=m || new_c<0 || new_c>=n) continue;
                if(grid[new_r][new_c]==0)
                    q.add(new Pair(new_r,new_c));
                grid[new_r][new_c]=1; //nearest land has been found
            }
            
        }
    }
        return ans-1;
    }
}