class Solution {
    public int countKDifference(int[] nums, int k) {
        int[] count = new int[101];
        int ans = 0;
        for (int n: nums) count[n]++;
        for (int i = 1; i <= 100; i++) {
            if (i + k <= 100) ans += count[i] * count[i + k];
        }
        return ans;
    }
}