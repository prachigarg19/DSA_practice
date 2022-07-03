class Solution {
    int[][] dp;
    public int longestPalindromeSubseq(String s) {
        dp=new int[s.length()+1][s.length()+1];
        for(int[] i:dp)
            Arrays.fill(i,-1);
        return check(s,0,s.length()-1);
        
    } 
     public int check(String s, int i, int j){
        if(i==j)
            return 1;
        if(i>j||j<0)
            return 0;
        if(dp[i][j]!=-1)
            return dp[i][j];
        if(s.charAt(i)==s.charAt(j))
            return dp[i][j]=check(s,i+1,j-1)+2;
        return dp[i][j]=Math.max(check(s,i+1,j),check(s,i,j-1));
    }
    
}