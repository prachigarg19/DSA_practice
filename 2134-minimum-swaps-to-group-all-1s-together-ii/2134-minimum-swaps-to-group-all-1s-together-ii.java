class Solution {

    public int minSwaps(int[] nums) {
        int[] newnums = new int[2 * nums.length];
        int count = 0, ones = 0;
        while (count < newnums.length) {
            for (int i = 0; i < nums.length; i++) {
                newnums[i + count] = nums[i];
                if (nums[i] == 1 && count < nums.length) ones++;
            }
            count += nums.length;
        }

        int zeroes = 0;
        for (int i = 0; i < ones; i++) {
            if (newnums[i] == 0) zeroes++;
        }
        int ans = zeroes;
        if (newnums[0] == 0) zeroes--;
        int i = 1, j = ones + i - 1;
        while (i < newnums.length && j < newnums.length) {
            if(newnums[j]==0) zeroes++;
            
            ans=Math.min(ans,zeroes);
            if(newnums[i]==0) zeroes--;
            i++;
            j++;
        }
        return ans;
    }
}
