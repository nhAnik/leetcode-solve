class Solution {
    public int numRollsToTarget(int n, int k, int target) {
        int[][] dp = new int[n][target + 1];
        for (int j = 1; j <= Integer.min(k, target); j++) dp[0][j] = 1;
        for (int i = 1; i < n; i++)
            for (int j = 1; j <= target; j++)
                for (int kk = 1; kk <= k; kk++)
                    if (j > kk) dp[i][j] = (dp[i][j] + dp[i - 1][j - kk]) % 1000000007;
        return dp[n - 1][target];
    }
}