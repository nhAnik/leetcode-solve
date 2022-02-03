class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> map = new HashMap<>();
        int len = nums1.length, sm, cnt = 0;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                sm = -(nums1[i] + nums2[j]);
                map.put(sm, map.getOrDefault(sm, 0) + 1);
            }
        }
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                sm = nums3[i] + nums4[j];
                cnt += map.getOrDefault(sm, 0);
            }
        }
        return cnt;
    }
}