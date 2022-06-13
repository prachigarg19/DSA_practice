class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] a=new int[128];
        Arrays.fill(a,-1);
        int i=0,j=0,ans=-1;
        while(i<s.length()){
            int c = s.charAt(i);
            if(a[c]==-1)
                a[c] = i;
            else{
                int val=a[c];
                j=val+1;
                for(int k=0;k<128;k++){
                    if(a[k] <= val)
                        a[k]=-1;
                }
                a[c] = i;
            }
            
            ans=Math.max(ans,i-j+1);
            i++;
        }
        return ans == -1?0:ans;
    }
}