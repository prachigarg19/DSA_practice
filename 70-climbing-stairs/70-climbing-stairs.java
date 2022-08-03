class Solution {
    int[] dp;
    public int climbStairs(int n) {
        int next=0, next2=0, curr=1;
        for(int i=n;i>=0;i--){
            next2=next;
            next=curr;
            curr=next+next2;
           
        }
        return next;
    }
}