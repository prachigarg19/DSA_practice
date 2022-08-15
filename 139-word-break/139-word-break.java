class Solution {
    int[] dp;
    public boolean wordBreak(String s, List<String> wordDict) {
        dp=new int[s.length()+1];
        Arrays.fill(dp,-1);
        return solve(s,0,wordDict)==1?true:false;
    }
    public int solve(String s, int i, List<String> word){
        if(i==s.length())
            return 1;
        if(i>s.length())
            return 0;
        if(dp[i]!=-1)
            return dp[i];
        for(int j=i;j<s.length();j++){
            if(word.contains(s.substring(i,j+1)) && solve(s,j+1,word)==1){
                dp[i] = 1;
                break;
            }
            else dp[i]=0;
        }
        return dp[i];
    }
}