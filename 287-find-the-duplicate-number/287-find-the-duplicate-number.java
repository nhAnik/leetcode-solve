class Solution {
    public int findDuplicate(int[] nums) {
        for (int x: nums) {
            int absx = Math.abs(x);
            if (nums[absx] < 0) return absx;
            nums[absx] = -nums[absx];
        }
        return -1;
    }
}