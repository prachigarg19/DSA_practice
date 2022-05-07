class Solution {
    public boolean find132pattern(int[] nums) {
//         int min=nums[0];
//         int[] minele=new int[nums.length];
//         minele[0]=nums[0];
//         for(int i=1;i<nums.length;i++)
//         {
//             if(nums[i]<min)
//             {
//                 min=nums[i];
                
//             }
//             minele[i]=min;
//         }
//         Stack<Integer> st=new Stack<>();
//         for(int i=0;i<nums.length;i++)
//         {   
//             int ele=nums[i];
//             while(!st.isEmpty()&&ele<=nums[st.peek()])
//             {
//                 int x=st.pop();
//                 if(ele!=nums[x]&&ele>minele[x]&&nums[x]!=minele[i])
//                     return true;
//             }
//             st.push(i);
//         }
//         return false;
       Stack<int[]> st = new Stack<>();
        int min = nums[0];
        st.push(new int[]{nums[0], min});
        
        for(int i = 1; i < nums.length; i++) {
            while(st.size() > 0 && st.peek()[0] <= nums[i]) {
                st.pop();
            }
            if(st.size() > 0 && st.peek()[1] < nums[i]) {
                return true;
            }
            st.push(new int[]{nums[i], min});
            min = Math.min(min, nums[i]);
        }
        return false;
    }
}