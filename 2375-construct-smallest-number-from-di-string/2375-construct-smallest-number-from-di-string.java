class Solution {
    public String smallestNumber(String pattern) {
        String ans="";
        StringBuilder temp=new StringBuilder();
        for(int i=1;i<=pattern.length()+1;i++)
            temp.append(i);
        for(int i=0;i<pattern.length();i++){
            if(pattern.charAt(i)=='I') continue;
            int start=i;
            while(i<pattern.length() && pattern.charAt(i) == 'D'){
                i++;
            }
            StringBuilder temp2=new StringBuilder(temp.substring(start,i+1));
            temp.replace(start,i+1,temp2.reverse().toString());
        }
        return temp.toString();
    }
}