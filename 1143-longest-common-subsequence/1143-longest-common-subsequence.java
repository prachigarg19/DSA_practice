class Solution {
    int[][] dp;
    public int longestCommonSubsequence(String text1, String text2) {
        dp=new int[text1.length()][text2.length()];
        for(int[] i:dp)
            Arrays.fill(i,-1);
        return find(text1,text2,0,0);
        
    }
    public int find(String t1, String t2,int i,int j){
        if(i>=t1.length()||j>=t2.length()){
            return 0;
        }
        if(dp[i][j]!=-1)
            return dp[i][j];
        if(t1.charAt(i)==t2.charAt(j))
            return dp[i][j]=find(t1,t2,i+1,j+1)+1;
        return dp[i][j]=Math.max(find(t1,t2,i,j+1),find(t1,t2,i+1,j));
    }
}