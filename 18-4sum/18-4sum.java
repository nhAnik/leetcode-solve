class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int len = nums.length, newTarget, p, q;
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            for (int j = i + 1; j < len; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1])
                    continue;
                newTarget = target - nums[i] - nums[j];
                p = j + 1;
                q = len - 1;
                while (p < q) {
                    if (nums[p] + nums[q] == newTarget) {
                        ans.add(List.of(nums[i], nums[j], nums[p], nums[q]));
                        p++;
                        while (p < len && nums[p] == nums[p-1]) p++;
                        q--;
                        while (q > 0 && nums[q] == nums[q+1]) q--;
                    }
                    else if (nums[p] + nums[q] < newTarget)
                        p++;
                    else
                        q--;
                }
            }
        }
        return ans;
    }
}