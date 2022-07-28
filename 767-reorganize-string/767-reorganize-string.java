class Solution {
    public String reorganizeString(String s) {
        int[] hash=new int[26];
        //storing frequency
        int ans=0;
        char letter=s.charAt(0);
        for(int i=0;i<s.length();i++){
            hash[s.charAt(i)-'a']++;
            if(ans<hash[s.charAt(i)-'a']){
                letter=s.charAt(i);
                ans=hash[s.charAt(i)-'a'];
            }
        }
        if(ans>(s.length()+1)/2) return "";
        char[] res=new char[s.length()];
        int ind=0;
        while(ans-->0){
            res[ind]=letter;
            ind+=2;
        }
        hash[letter-'a']=0;
        for(int i=0;i<hash.length;i++){
            if(hash[i]==0) continue;
            while(hash[i]>0){
                if(ind>=s.length())
                    ind=1;
                res[ind]=(char)(i+'a');
                ind+=2;
                hash[i]--;
            }
        }
        String fans="";
        for(char c:res)
            fans+=c;
        return fans;
    }
}