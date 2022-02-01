class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length, buy = prices[0], ans = 0;
        for (int i = 1; i < len; i++) {
            ans = Integer.max(ans, prices[i] - buy);
            buy = Integer.min(buy, prices[i]);
        }
        return ans;
    }
}