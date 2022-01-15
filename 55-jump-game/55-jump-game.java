class Solution {
    public boolean canJump(int[] nums) {
        int len = nums.length, end = 0;
        for (int i = 0; i < len; i++) {
            if (i > end)
                return false;
            end = Math.max(end, i + nums[i]);
        }
        return true;
    }
}