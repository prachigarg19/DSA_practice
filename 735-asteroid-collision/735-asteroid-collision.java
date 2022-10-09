class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();
         int[] dp=new int[asteroids.length];
        for(int i=0;i<asteroids.length;i++){
            if(!st.isEmpty() &&asteroids[st.peek()]>0 && asteroids[i]<0){
            if(asteroids[st.peek()]<-asteroids[i])
            {while(!st.isEmpty() &&asteroids[st.peek()]>0 && asteroids[i]<0 && asteroids[st.peek()]<-asteroids[i])
                st.pop();
            }
            if(!st.isEmpty() &&asteroids[st.peek()]>0 && asteroids[i]<0 &&asteroids[st.peek()] == -asteroids[i]){
                st.pop();
                continue;
            }
            if(!st.isEmpty() &&asteroids[st.peek()]>0 && asteroids[i]<0 &&asteroids[st.peek()]>-asteroids[i]){
                continue;
            }
                st.push(i);
                              }
          else st.push(i);
                              }
        int[] ans=new int[st.size()];
        while(!st.isEmpty()){
            ans[st.size()-1] = asteroids[st.pop()];
        }
        return ans;
    }
}