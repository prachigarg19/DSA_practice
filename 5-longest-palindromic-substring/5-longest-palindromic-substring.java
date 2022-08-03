class Solution {
    int[][] dp;
    public String longestPalindrome(String s) {
       dp=new int[s.length()][s.length()];
        int start=0,end=0;
        for(int i=0;i<dp.length;i++){
            dp[i][i] = 1;
            if(i<dp.length-1 && s.charAt(i)==s.charAt(i+1)){
                dp[i][i+1] = 1;
                start=i;
                end=i+1;
            }
        }
        for(int i=dp.length-1;i>=0;i--){
            for(int j=i+1;j<dp.length;j++){
              
                if (s.charAt(i)==s.charAt(j)&&dp[i+1][j-1]==1)
                {
                    if(j-i+1>end-start+1){
                        start=i;
                        end=j;
                    }
                    dp[i][j]=1;
                }
            }
        }
        if(start==end) return s.substring(start,end+1);
        return s.substring(start,end+1);
    }
}