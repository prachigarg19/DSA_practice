class Solution {

    public int candy(int[] ratings) {
        //first going from left to right
        int[] dp = new int[ratings.length];
        Arrays.fill(dp, 1);
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1]) dp[i] = dp[i - 1] + 1;
        }
        int sum = dp[ratings.length - 1];
        for (int i = ratings.length - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                dp[i] = Math.max(dp[i], dp[i + 1] + 1);
            }
            sum += dp[i];
        }
        return sum;
    }
}
