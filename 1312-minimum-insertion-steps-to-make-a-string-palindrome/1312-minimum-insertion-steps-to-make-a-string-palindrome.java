class Solution {
    int[][] dp;
    public int minInsertions(String s) {
        dp=new int[s.length()+1][s.length()+1];
        for(int[] i:dp)
            Arrays.fill(i,(int)1e6);
        return solve(s,0,s.length()-1);
    }
    public int solve(String s,int i,int j){
        if(i==j)
            return 0;
        if(i>j) return 0;
        if(dp[i][j]!=(int)1e6)
            return dp[i][j];
        if(s.charAt(i)==s.charAt(j))
            return dp[i][j]=solve(s,i+1,j-1);
        return dp[i][j]=Math.min(solve(s,i+1,j),solve(s,i,j-1))+1;
    }
}