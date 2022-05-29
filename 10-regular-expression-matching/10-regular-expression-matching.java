class Solution {
    public boolean isMatch(String s, String p) {
        int sl = s.length(), pl = p.length();
        char cs, cp;
        boolean[][] dp = new boolean[sl + 1][pl + 1];
        dp[0][0] = true;
        for (int i = 2; i <= pl; i+=2) {
            if (p.charAt(i - 1) == '*') dp[0][i] = true;
            else break;
        }
        for (int i = 1; i <= sl; i++) {
            for (int j = 1; j <= pl; j++) {
                cs = s.charAt(i - 1); cp = p.charAt(j - 1);
                if (cs == cp || cp == '.') dp[i][j] = dp[i - 1][j - 1];
                else if (cp == '*') {
                    char prev = p.charAt(j - 2);
                    if (prev == cs || prev == '.') dp[i][j] = dp[i - 1][j] || dp[i][j - 1];
                    dp[i][j] = dp[i][j] || dp[i][j - 2];
                }
            }
        }
        return dp[sl][pl];
    }
}