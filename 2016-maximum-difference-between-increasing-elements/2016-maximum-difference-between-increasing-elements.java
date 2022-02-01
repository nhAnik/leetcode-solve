class Solution {
    public int maximumDifference(int[] nums) {
        int len = nums.length, minVal = nums[0], ans = -1;
        for (int i = 1; i < len; i++) {
            if (nums[i] > minVal)
                ans = Integer.max(ans, nums[i] - minVal);
            minVal = Integer.min(minVal, nums[i]);
        }
        return ans;
    }
}