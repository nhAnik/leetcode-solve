class Solution {
    public int lengthOfLIS(int[] nums) {
        int len = nums.length, maxLen = 0, idx;
        int[] curList = new int[len];
        for (int i = 0; i < len; i++) {
            idx = Arrays.binarySearch(curList, 0, maxLen, nums[i]);
            if (idx < 0) idx = -(idx + 1);
            curList[idx] = nums[i];
            maxLen  = Integer.max(maxLen, idx + 1);
        }
        return maxLen;
    }
}