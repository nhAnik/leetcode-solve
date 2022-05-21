class Solution {
    
    public int longestCommonSubsequence(String s, String t) {
        int n = s.length(), m = t.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (t.charAt(i - 1) == s.charAt(j - 1)) dp[i][j] = 1 + dp[i - 1][j - 1];
                else dp[i][j] = Integer.max(dp[i][j - 1], dp[i - 1][j]);
            }
        }
        return dp[m][n];
    }
}