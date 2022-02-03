class Solution {
    public int lengthOfLIS(int[] nums) {
        int len = nums.length, mxVal, ans = 1;
        int[] dp = new int[len];
        dp[0] = 1;
        for (int i = 1; i < len; i++) {
            mxVal = 0;
            for (int j = 0; j < i; j++)
                if (nums[i] > nums[j]) mxVal = Integer.max(mxVal, dp[j]);
            dp[i] = 1 + mxVal;
            ans = Integer.max(ans, dp[i]);
        }
        return ans;
    }
}