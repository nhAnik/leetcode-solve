class Solution {
    public int subarraySum(int[] nums, int k) {
        int len = nums.length, cnt = 0;
        for (int i = 1; i < len; i++) nums[i] += nums[i - 1];
        for (int n: nums) if (n == k) cnt++;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++)
                if (nums[i] + k == nums[j])
                    cnt++;
        }
        return cnt;
    }
}