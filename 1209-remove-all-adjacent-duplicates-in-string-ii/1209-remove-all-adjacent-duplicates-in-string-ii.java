class Solution {
    public String removeDuplicates(String s, int k) {
        int i=0,repeat=0;
        StringBuilder str=new StringBuilder();
        Stack<Pair<Character,Integer>> st=new Stack<>();
        while(i<s.length())
        {   
            if(!st.isEmpty()&&s.charAt(i)==st.peek().getKey())
            {   int count=st.peek().getValue()+1;
                st.push(new Pair(s.charAt(i),count));
                if(count==k)
                {
                    while(count-->0)
                    {
                        st.pop();
                    }
                    
                }
            }
            else 
            {
            st.push(new Pair(s.charAt(i),1));
            }
            i++;
        }
        while(!st.isEmpty())
        str.append(st.pop().getKey());
        
        return str.reverse().toString();
    }
}