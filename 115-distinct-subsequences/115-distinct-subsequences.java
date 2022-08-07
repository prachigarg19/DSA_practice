class Solution {
    int[][] dp;
    public int numDistinct(String s, String t) {
        dp=new int[s.length()+1][t.length()+1];
        for(int[] i:dp)
            Arrays.fill(i,-1);
        return solve(s,t,0,0);
        
    }
    public int solve(String s, String t, int i, int j){
        if(j==t.length())
            return 1;
        if(i>=s.length()||j>t.length())
            return 0;
        if(dp[i][j]!=-1)
            return dp[i][j];
        if(s.charAt(i)==t.charAt(j))
            return dp[i][j] = solve(s,t,i+1,j) + solve(s,t,i+1,j+1);
        return dp[i][j] = solve(s,t, i+1, j);
    }
}