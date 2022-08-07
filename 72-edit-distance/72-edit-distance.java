class Solution {
    int[][] dp;
    public int minDistance(String w1, String w2) {
        dp=new int[w1.length()+1][w2.length()+1];
        for(int[] i: dp)
            Arrays.fill(i,(int)1e6);
        return solve(w1,w2,0,0);
    }
    public int solve(String w1, String w2, int i, int j){
        if(j==w2.length())
            return w1.length()-i;
        if(i==w1.length())
            return w2.length()-j;
        if(i>w1.length()||j>w2.length())
            return (int)1e6;
        if(dp[i][j]!=(int)1e6)
            return dp[i][j];
        if(w1.charAt(i)==w2.charAt(j))
            return dp[i][j] = solve(w1,w2,i+1,j+1);
        return dp[i][j] = Math.min(solve(w1,w2,i+1,j),Math.min(solve(w1,w2,i+1,j+1), solve(w1,w2,i,j+1)))+1;
        
    }
}