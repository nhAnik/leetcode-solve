class Solution {
    public boolean isMatch(String s, String p) {
        int sl = s.length(), pl = p.length();
        boolean[][] dp = new boolean[sl + 1][pl + 1];
        dp[0][0] = true;
        for (int j = 1; j <= pl; j++) {
            if (p.charAt(j - 1) == '*') dp[0][j] = true;
            else break;
        }
        char cs, cp;
        for (int i = 1; i <= sl; i++) {
            for (int j = 1; j <= pl; j++) {
                cp = p.charAt(j - 1);
                cs = s.charAt(i - 1);
                if (cp == '?' || cs == cp)
                    dp[i][j] = dp[i - 1][j - 1];
                else if (cp == '*')
                    dp[i][j] = dp[i - 1][j] || dp[i][j - 1];
            }
        }
        return dp[sl][pl];
    }
}