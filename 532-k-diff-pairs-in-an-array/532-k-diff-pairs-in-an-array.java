class Solution {
    public int findPairs(int[] nums, int k) {
        int cnt = 0, val, lo, hi;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            if (binSrc(nums, nums[i] + k, i + 1) != -1)
                cnt ++;
        }
        return cnt;
    }

    private int binSrc(int[] nums, int x, int start) {
        int lo = start, hi = nums.length - 1, md, ans = -1;
        while (lo <= hi) {
            md = lo + (hi - lo) / 2;
            if (nums[md] == x) return md;
            else if (x < nums[md]) hi = md - 1;
            else lo = md + 1;
        }
        return -1;
    }
}