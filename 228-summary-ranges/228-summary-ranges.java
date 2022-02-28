class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        if (nums.length == 0) return ans;
        int start = nums[0], end = nums[0], len = nums.length;
       
        for (int i = 1; i < len; i++) {
            if (nums[i] > nums[i - 1] + 1) {
                end = nums[i - 1];
                if (start == end) ans.add(String.valueOf(start));
                else ans.add(start + "->" + end);
                start = nums[i];
            }
        }
        if (nums[len - 1] == start) ans.add(String.valueOf(start));
        else ans.add(start + "->" + nums[len - 1]);
        return ans;
    }
}