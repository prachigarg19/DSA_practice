class Solution {
    public String largestPalindromic(String num) {
        int[] map = new int[10];
        int single=-1,inc=-1;
        for(int i=0;i<num.length();i++){
            map[num.charAt(i)-'0']++;
            if(num.charAt(i)!='0' && map[num.charAt(i)-'0']%2==0 && map[0]!=0) inc=1;
        }
        StringBuilder str=new StringBuilder();
        for(int i=9;i>=0;i--){
            if(map[i]%2==1){
                str.append(i);
                single=i;
                break;
            }
        }
        // System.out.println(inc);
        for(int i=0;i<=9;i++){
            if(inc==-1 && i==0) continue;
            while(map[i]>1){
                str.append(i);
                map[i]-=2;
            }
        }
         StringBuilder ans=new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            if(i==0 && single!=-1) break;
            ans.append(str.charAt(i));
            
        }
        ans.append(str);
        if(ans.length()==0) ans.append(num.charAt(0));
        return ans.toString();
    }
}