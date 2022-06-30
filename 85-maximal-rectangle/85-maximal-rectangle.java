class Solution {
    public int maximalRectangle(char[][] matrix) {
        int[] dp=new int[matrix[0].length+1];
        int res=0;
        for(int r=0;r<matrix.length;r++){
            for(int c=0;c<matrix[0].length;c++){
                if(matrix[r][c]=='0')
                    dp[c]=0;
                else dp[c]+=1;
            }
            res=Math.max(res,largestRectangleArea(dp));
        }
        return res;
    }
    public int largestRectangleArea(int[] nums) {
     
        Stack<Integer> st=new Stack<>();
        int left[]=new int[nums.length];
        int right[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
        while(!st.isEmpty()&&nums[st.peek()]>=nums[i])
        st.pop();
            if(st.isEmpty()) left[i]=-1;
            else left[i]=st.peek();
            st.push(i);
    
    }
        st.clear();
        for(int i=nums.length-1;i>=0;i--)
        {
            while(!st.isEmpty()&&nums[st.peek()]>=nums[i])
            st.pop();
            if(st.isEmpty()) right[i]=nums.length;
            else right[i]=st.peek();
            st.push(i);
            
        }
       
    int ans=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {  
            ans=Math.max(ans,nums[i]*(right[i]-left[i]-1));
   
        }
     return ans;   
    }
}