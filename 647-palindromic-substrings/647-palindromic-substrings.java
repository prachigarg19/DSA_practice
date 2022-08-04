class Solution {
    int[][] dp;
    public int countSubstrings(String s) {
        dp=new int[s.length()+1][s.length()+1];
        for(int[] i:dp)
            Arrays.fill(i,-1);
        int count=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                // System.out.println(solve(s,i,j));
                if(solve(s,i,j)==1)
                    count++;
            }
        }
        return count;
    }
    public int solve( String s, int i, int j){
        if(i==j)
            return 1;
        if(j==i+1&&s.charAt(i)==s.charAt(j))
            return dp[i][j] = 1;
        if(j<i)
            return 0;
         if(dp[i][j]!=-1)
            return dp[i][j];
        if(s.charAt(i) == s.charAt(j))
            return dp[i][j] = solve(s,i+1,j-1);
        return 0;
    }
    
}