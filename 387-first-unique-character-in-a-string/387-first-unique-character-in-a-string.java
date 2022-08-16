class Solution {
    public int firstUniqChar(String s) {
        int[] store=new int[26];
        for(int i=0;i<s.length();i++){
            store[s.charAt(i)-'a']++;
        }
        int ans=s.length();
        for(int i=0;i<store.length;i++)
        {
            if(store[i]==1){
                for(int j=0;j<s.length();j++){
                    if(s.charAt(j)==(char)'a'+i){
                        ans=Math.min(ans,j);
                        break;
                    }
                }
            }
        }
        return ans==s.length()?-1:ans;
    }
}