class Solution {
    
    public boolean hasAllCodes(String s, int k) {
        //total number of possible combinations = 2^k
        
        int n=1<<k;
        
        int dp[]=new int[n];
        
        for(int i=0; i+k<=s.length();i++){
            dp[Integer.valueOf(s.substring(i,i+k),2)]=1;
        }
        for(int i=0;i<dp.length;i++){
            if(dp[i]==0) return false;
        }
        return true;
    }
   
}
