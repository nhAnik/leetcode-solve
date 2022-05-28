class Solution {
    public int findDuplicate(int[] nums) {
        int[] cnt = new int[nums.length];
        for (int x: nums) {
            if (cnt[x] > 0) return x;
            cnt[x] += 1;
        }

        return -1;
    }
}