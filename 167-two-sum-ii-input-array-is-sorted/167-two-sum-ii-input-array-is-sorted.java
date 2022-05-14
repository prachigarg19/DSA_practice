class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int[] ans=new int[2];
        for(int i=0;i<numbers.length-1;i++){
            
            int l=i+1,h=numbers.length-1;
            while(l<=h){
                int mid=l+(h-l)/2;
                if(numbers[i]+numbers[mid]==target)
                {
                    ans[0]=i+1;
                    ans[1]=mid+1;
                    break;
                }
                else if(numbers[i]+numbers[mid] < target)
                    l=mid+1;
                else
                    h=mid-1;
                
            }
        }
        return ans;
    }
}