class Solution {
    int[][] dp;
    public int longestCommonSubsequence(String t1, String t2) {
        dp = new int[t1.length()+1][t2.length()+1];
        for(int i=t1.length()-1;i>=0;i--){
            for(int j=t2.length()-1;j>=0;j--){
                if(dp[i][j]!=0)
                    continue;
                if(t1.charAt(i)==t2.charAt(j))
                    dp[i][j] = dp[i+1][j+1]+1;
                else 
                    dp[i][j] = Math.max(dp[i+1][j],dp[i][j+1]);
            }
        }
        return dp[0][0];
    }
}