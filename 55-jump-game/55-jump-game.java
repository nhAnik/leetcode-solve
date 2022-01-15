class Solution {
    public boolean canJump(int[] nums) {
        int len = nums.length, end = -1;
        if (len == 1)
            return true;
        for (int i = 0; i < len - 1; i++) {
            if (end != -1 && i > end)
                break;
            end = Math.max(end, i + nums[i]);
            if (end >= len - 1)
                return true;
        }
        return false;
    }
}