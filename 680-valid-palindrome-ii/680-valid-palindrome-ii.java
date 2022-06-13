class Solution {
    public boolean validPalindrome(String s) {
        if(s.length()==1) return true;
        int i=0,j=s.length()-1;
        while(i<j){
            if( s.charAt(i)!=s.charAt(j))
            {
                return isPallin(s,i+1,j) || isPallin(s,i,j-1);
            }
           i++;
            j--;
        }
         return true;
    }
    
    public boolean isPallin( String s, int b, int e){
        
        if(s.length()<=1) return true;
        
        while(b<e){
            if( s.charAt(b)!=s.charAt(e))
                return false;
            b++;
            e--;
        }
        return true;
    }
}