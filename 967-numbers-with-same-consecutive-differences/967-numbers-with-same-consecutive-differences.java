class Solution {
    ArrayList<Integer> ans1;
    public int[] numsSameConsecDiff(int n, int k) {
        ans1=new ArrayList<>();
        
        for(int i=1;i<=9;i++){
            String str="";
            solve(n,k,1, i,str);
        }
        
        int[] ans2=new int[ans1.size()];
        for(int i=0;i<ans1.size();i++){
            ans2[i]=ans1.get(i);
        }
        return ans2;
    }
    public void solve(int n, int k, int i, int val, String str){
         if(val<0 || val>9) return;
        if(i==n){
            ans1.add(Integer.valueOf(str+val));
            return;
        }
       
        if(val+k == val-k ) solve(n,k,i+1,val+k,str+val);
        else{
        solve(n,k,i+1,val+k,str+val);
        solve(n,k,i+1,val-k,str+val);
        }
    }
}