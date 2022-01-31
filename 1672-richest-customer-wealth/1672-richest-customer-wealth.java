class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans = 0;
        for (int[] account: accounts) {
            ans = Integer.max(ans, Arrays.stream(account).sum());
        }
        return ans;
    }
}