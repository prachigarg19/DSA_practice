class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<num.length();i++){
            while(!st.isEmpty() && st.peek()>num.charAt(i) && k>0){
                st.pop();
                k--;
            }
            if(st.isEmpty()&&num.charAt(i)=='0') continue;
            st.push(num.charAt(i));
        }
        
        while(k-->0&&!st.isEmpty()){
            st.pop();
        }
        StringBuilder ans=new StringBuilder();
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        // System.out.println(ans);
        String fans=ans.reverse().toString();
        return fans.length()==0?"0":fans;
    }
}