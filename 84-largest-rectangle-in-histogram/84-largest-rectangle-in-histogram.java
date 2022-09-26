class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st=new Stack<>();
        int[] small = new int[heights.length];
        int[] small2 = new int[heights.length];
        Arrays.fill(small,-1);
        Arrays.fill(small2,heights.length);
        st.push(0);
        for(int i=1;i<heights.length;i++){
            while(!st.isEmpty()&&heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(!st.isEmpty()){
                small[i]=st.peek();
            }
            st.push(i);
        }
        st.clear();
        st.push(0);
        for(int i=1;i<heights.length;i++){
            while(!st.isEmpty()&&heights[st.peek()]>=heights[i]){
                int x=st.pop();
                small2[x]=i;
            }
            st.push(i);
        }
        int ans=-1;
        for(int i=0;i<small.length;i++){
            //we will exclude both previous smaller and next smaller as these will reduce our answer
            ans=Math.max(heights[i]*(small2[i]-small[i]-1),ans);
        }
        return ans;
    }
}