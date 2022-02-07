class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0, high = 0, mid;
        for (int w: weights) {
            low = Integer.max(low, w);
            high += w;
        }
        while (low < high) {
            mid = low + (high - low) / 2;
            if (getCount(weights, mid) <= days) high = mid;
            else low = mid + 1;
        }
        return low;
    }

    private int getCount(int[] weights, int capacity) {
        int cnt = 0, total = 0;
        for (int w: weights) {
            if (total + w > capacity) {
                cnt++;
                total = 0;
            }
            total += w;
        }
        if (total > 0) cnt++;
        return cnt;
    }
}