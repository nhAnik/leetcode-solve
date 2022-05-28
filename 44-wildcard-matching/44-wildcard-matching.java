class Solution {
    public boolean isMatch(String s, String p) {
        int sl = s.length(), pl = p.length();
        Boolean[][] dp = new Boolean[sl + 1][pl + 1];
        return isMatchUtil(s, p, sl - 1, pl - 1, dp);
    }

    private boolean isMatchUtil(String s, String p, int si, int pi, Boolean[][] dp) {
        if (si < -1 || pi < -1)
            return false;
        if (dp[si + 1][pi + 1] != null)
            return dp[si + 1][pi + 1];
        if (si == -1 && pi == -1)
            return true;
        boolean retVal = false;
        if ((pi >= 0 && p.charAt(pi) == '?') || (si >= 0 && pi >= 0 && s.charAt(si) == p.charAt(pi)))
            retVal = isMatchUtil(s, p, si - 1, pi - 1, dp);
        else if (pi >= 0 && p.charAt(pi) == '*')
            retVal = isMatchUtil(s, p, si, pi - 1, dp) || isMatchUtil(s, p, si - 1, pi, dp);
        return dp[si + 1][pi + 1] = retVal;
    }
}