class Solution {
    // int[][] dp;
    public int longestValidParentheses(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==')') continue;
            int count=1;
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(j)==')')
                    count--;
                else count++;
                
                if(count==0)
                    ans=Math.max(ans,j-i+1);
                if(count<0) break;
            }
            
        }
        return ans;
    }
   
}