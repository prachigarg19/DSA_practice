class Solution {
    int dp[][][];

    public int findMaxForm(String[] str, int m, int n) {
        dp = new int[str.length + 1][m+1][n+1];
         return per(str,m, n, 0)-1;
    }

    public int per(String[] str,int m,int n,int i) {
        if (i == str.length) {
            if (m>=0 && n>=0) {
                
                return dp[i][m][n]=1;
            }
            return 0;
        }
        if(m<0||n<0) return 0;
        if (dp[i][m][n] != 0) return dp[i][m][n];
        int zero=0,one=0;
        for(int j=0;j<str[i].length();j++)
        {
            if(str[i].charAt(j)=='0')
                zero+=1;
        }
        one=str[i].length()-zero;
        
        return dp[i][m][n] = Math.max(per(str, m-zero, n-one,i+1) + 1, per(str, m, n,i+1));
    }
}
