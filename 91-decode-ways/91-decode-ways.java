class Solution {
    int[] dp;
    public int numDecodings(String s) {
        HashMap<String, Character> hm = new HashMap<>();
        for(int i=1;i<=26;i++){
            hm.put(Integer.toString(i),(char)(i+'A'-1));
        }
        dp=new int[s.length()];
        return solve(s,0,hm);
    }
    public int solve(String s, int i, HashMap<String, Character> hm){
        if(i>=s.length())
            return 1;
        if(dp[i]!=0)
            return dp[i];
        for(int j=i;j<s.length();j++){
            if(hm.containsKey(s.substring(i,j+1)))
                dp[i]+=solve(s,j+1,hm);
        }
        return dp[i];
    }
}