class Solution {
    int[][] dp;
    public int minimumTotal(List<List<Integer>> triangle) {
        dp=new int[triangle.size()][triangle.get(triangle.size()-1).size()];
        for(int i=0;i<dp.length;i++)
            Arrays.fill(dp[i],(int)1e6);
        return per(triangle,0,0);
    }
    public int per(List<List<Integer>> triangle, int r, int c){
        
        if(r==triangle.size())
            return 0;
        if(c>triangle.get(r).size())
            return (int)1e6;
        if(dp[r][c]!=(int)1e6) return dp[r][c];
        
        return dp[r][c]=Math.min(per(triangle,r+1,c),per(triangle,r+1,c+1))+triangle.get(r).get(c);
    }
}