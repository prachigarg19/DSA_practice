class Solution {
    int[][] dp;
    public int longestCommonSubsequence(String t1, String t2) {
        dp = new int[t1.length()+1][t2.length()+1];
        for(int[] i: dp)
            Arrays.fill(i,-1);
        return solve(t1,t2,0,0);
    }
    public int solve(String t1, String t2, int i,int j){
        if(j>=t2.length())
            return 0;
        if(i>=t1.length())
            return 0;
        if(dp[i][j]!=-1)
            return dp[i][j];
        if(t1.charAt(i)==t2.charAt(j))
            return dp[i][j] = solve(t1,t2,i+1,j+1)+1;
        
        return dp[i][j] = Math.max(solve(t1,t2,i+1,j), solve(t1,t2,i,j+1));
            
    }
}