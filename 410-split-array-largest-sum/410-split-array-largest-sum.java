class Solution {
    public int splitArray(int[] nums, int m) {
        int low = 0, high = 0, mid;
        for (int n: nums) {
            low = Integer.max(low, n);
            high += n;
        }
        while (low < high) {
            mid = low + (high - low) / 2;
            if (getCount(nums, mid) <= m) high = mid;
            else low = mid + 1;
        }
        return low;
    }
    
    private int getCount(int[] nums, int sum) {
        int cnt = 0, total = 0;
        for (int n: nums) {
            if (total + n > sum) {
                cnt++;
                total = 0;
            }
            total += n;
        }
        if (total > 0) cnt++;
        return cnt;
    }
}