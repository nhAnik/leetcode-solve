class Solution {
    public int coinChange(int[] coins, int amount) {
        int len = coins.length, minCost;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            minCost = Integer.MAX_VALUE;
            for (int j = 0; j < len; j++) {
                if (i - coins[j] < 0 || dp[i - coins[j]] == -1) continue;
                minCost = Math.min(minCost, dp[i - coins[j]]);
            }
            if (minCost != Integer.MAX_VALUE)
                dp[i] = 1 + minCost;
        }
        return dp[amount];
    }
}