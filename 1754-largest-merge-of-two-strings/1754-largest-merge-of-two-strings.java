class Solution {
    public String largestMerge(String word1, String word2) {
        StringBuilder str=new StringBuilder();
        int i=0,j=0;
        while( i< word1.length()&& j<word2.length())
        {   int res=check(word1,word2,i,j);
            if(res >0){
                str.append(word1.charAt(i));
                i++;
            }
            else {
                str.append(word2.charAt(j));
               j++;
            }
            
        }
        
        if(i<word1.length()){
            str.append(word1.substring(i,word1.length()));
        }
        if(j<word2.length()){
            str.append(word2.substring(j,word2.length()));
        }
        return str.toString();
    }
    public int check(String s1, String s2,int start1,int start2){
        int i=start1,j=start2;
        while(i<s1.length()&&j<s2.length()){
        if(s1.charAt(i)>s2.charAt(j))
            return 1;
        else if(s1.charAt(i) < s2.charAt(j))
            return -1;
            i++; j++;
        }
        if(i==s1.length()&&j==s2.length()) return 0;
        return i>=s1.length()?-1:1;
    }
}