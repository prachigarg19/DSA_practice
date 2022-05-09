class Solution {
    
    List<String> ans;
    public List<String> letterCombinations(String digits) {
        String map[]={"","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        ans=new ArrayList<>();
        if(digits.length()==0) return ans;
        combinations(digits,0,"",map);
        return ans;
    }
    public void combinations(String digits,int index,String str,String[] map)
    {
        if(index==digits.length())
        {
            ans.add(str);
            return;
        }
        int x=digits.charAt(index)-'0'-1;
        for(int i=0;i<map[x].length();i++)
        {
            combinations(digits,index+1,str+map[x].charAt(i),map);
        }
        
    }
}