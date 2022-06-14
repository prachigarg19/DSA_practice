class Solution {
    int[][] dp;
    public int minDistance(String word1, String word2) {
        dp=new int[word1.length()+1][word2.length()+1];
        return word1.length() + word2.length() - 2*per(word1,word2,word1.length(),word2.length());
    }
    
    public int per(String s1, String s2, int m,int n){
        if(m==0||n==0){
            return dp[0][0]=0;
        }
        
        if(dp[m][n]!=0)
            return dp[m][n];
        
        if(s1.charAt(m-1)==s2.charAt(n-1))
            return dp[m][n] = per(s1,s2,m-1,n-1)+1;
        
        
        int inc=per(s1,s2,m,n-1);
        int exc=per(s1,s2,m-1,n);
        
        return dp[m][n]=Math.max(inc,exc);
    }
}