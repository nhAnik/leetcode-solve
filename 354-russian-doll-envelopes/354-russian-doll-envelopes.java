class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes, (t0, t1) -> {
            if (t0[0] != t1[0]) return Integer.compare(t0[0], t1[0]);
            return -1 * Integer.compare(t0[1], t1[1]);
        });
        int len = envelopes.length, val, idx, curLen = 0;
        int[] curList = new int[len];
        for (int i = 0; i < len; i++) {
            val = envelopes[i][1];
            idx = Arrays.binarySearch(curList, 0, curLen, val);
            if (idx < 0) idx = -(idx + 1);
            curList[idx] = val;
            if (idx + 1 > curLen) curLen = idx + 1;
        }
        return curLen;
    }
}