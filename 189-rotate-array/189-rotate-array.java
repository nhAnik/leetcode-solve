class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length, cur, val, nextVal, cnt = 0;
        k = k % len;
        for (int start = 0; start < len; start++) {
            cur = start;
            val = nums[cur];
            do {
                cur = (cur + k) % len;
                nextVal = nums[cur];
                nums[cur] = val;
                val = nextVal;
                cnt++;
            } while (cur != start);
            if (cnt == len) break;
        }
    }
}