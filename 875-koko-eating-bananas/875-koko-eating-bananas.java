class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = Integer.MIN_VALUE, mid, ans;
        for (int x: piles) {
            if (x > high) high = x;
        }
        ans = high;
        while (low <= high) {
            mid = (low + high) / 2;
            int hr = getHour(piles, mid);
            if (hr > h) low = mid + 1;
            else {
                high = mid - 1;
                if (mid < ans) ans = mid;
            }
           
        }
        return ans;
    }
    
    private int getHour(int[] piles, int k) {
        int hr = 0;
        for (int x: piles) {
            hr += (x / k + (x % k != 0 ? 1: 0));
        }
        return hr;
    }
}