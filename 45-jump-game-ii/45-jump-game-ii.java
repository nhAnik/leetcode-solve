class Solution {
    public int jump(int[] nums) {
        int len = nums.length, start = 0, end = 0, step = 0, maxEnd;
        while (end < len - 1) {
            maxEnd = end;
            for (int i = start; i < Math.min(end + 1, len - 1); i++) 
                maxEnd = Math.max(maxEnd, i + nums[i]);
            start = end + 1;
            end = maxEnd;
            step++;
        }
        return step;
    }
}