class Solution {
    public boolean backspaceCompare(String s, String t) {
        ArrayList<Character> al1=new ArrayList<>();
         ArrayList<Character> al2=new ArrayList<>();
        findList(s,al1);
        findList(t,al2);
        
        return al1.equals(al2);
    }
    public void findList(String s,List<Character> al)
    {
         for(int i=0;i<s.length();i++)
        {
            if(al.size()!=0&&s.charAt(i)=='#')
                al.remove(al.size()-1);
            else if(s.charAt(i)!='#')
            al.add(s.charAt(i));
        }
       
    }
}