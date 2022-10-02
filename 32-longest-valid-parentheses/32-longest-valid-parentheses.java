class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> st=new Stack<>();
        int[] dp=new int[s.length()];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(i);
            } else {
                if(!st.isEmpty()){
                    dp[st.pop()]=1;
                    dp[i]=1;
                }
            }
        }
        
        int count=0,ans=0;
        for(int i: dp){
            // System.out.print(i+" ");
            if(i==1) count++;
            else {
               
                count=0;
            }
             ans=Math.max(count,ans);
        }
        return ans;
    }
}