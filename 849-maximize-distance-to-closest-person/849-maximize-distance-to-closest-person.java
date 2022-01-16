class Solution {
    public int maxDistToClosest(int[] seats) {
        int cnt = 0, mxCnt = 0, len = seats.length, idx = 0;
        while (seats[idx++] == 0) mxCnt++;
        while (idx < len) {
            if (seats[idx] == 1) {
                if ((cnt + 1) / 2 > mxCnt)
                    mxCnt = (cnt + 1) / 2;
                cnt = 0;
            } else cnt++;
            idx++;
        }
        if (cnt > mxCnt)
            mxCnt = cnt;
        return mxCnt;
    }
}