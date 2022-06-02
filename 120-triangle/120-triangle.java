class Solution {
    int[][] dp;

    public int minimumTotal(List<List<Integer>> triangle) {
        dp = new int[triangle.size() + 2][triangle.get(triangle.size() - 1).size() + 2];

        for (int i = 0; i < triangle.size(); i++) {
            for (int j = 0; j < triangle.get(triangle.size() - 1).size(); j++) 
                dp[i][j] = (int) 1e6;
        }
        
        for (int j = triangle.size(); j >= 0; j--) {
            for (int i = triangle.get(triangle.size() - 1).size(); i >= 0; i--) 
            {
                if (j == triangle.size()) {
                dp[i][j]=0;
                    continue;
                }
                
                if (dp[i][j] != (int) 1e6) continue;
                
                dp[j][i] = Math.min(dp[j+1][i] , dp[j+1][i+1]) + triangle.get(j).get(i);
            }
        }
        return dp[0][0];
    }

    
}
