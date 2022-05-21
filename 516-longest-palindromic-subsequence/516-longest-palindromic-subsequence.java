class Solution {
    private int lcs(String s, String t) {
        int n = s.length();
        int[][] dp = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (t.charAt(i - 1) == s.charAt(j - 1)) dp[i][j] = 1 + dp[i - 1][j - 1];
                else dp[i][j] = Integer.max(dp[i][j - 1], dp[i - 1][j]);
            }
        }
        return dp[n][n];
    }

    public int longestPalindromeSubseq(String s) {
        return lcs(s, new StringBuilder(s).reverse().toString());
    }
}