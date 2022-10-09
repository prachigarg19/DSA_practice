class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!st1.isEmpty() && s.charAt(i)=='#')
                st1.pop();
            else if(s.charAt(i)!='#')st1.push(s.charAt(i));
        }
         Stack<Character> st2=new Stack<>();
        for(int i=0;i<t.length();i++){
            if(!st2.isEmpty() &&t.charAt(i)=='#')
                st2.pop();
            else if(t.charAt(i)!='#')st2.push(t.charAt(i));
        }
        while(!st1.isEmpty() && !st2.isEmpty()){
            if(st1.pop()!=st2.pop())
                return false;
        }
        return !st1.isEmpty() || !st2.isEmpty()?false: true;
    }
}