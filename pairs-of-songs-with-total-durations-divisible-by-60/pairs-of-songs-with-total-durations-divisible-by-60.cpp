class Solution {
public:
    int numPairsDivisibleBy60(vector<int>& time) {
        int len = time.size(), cnt[60] = {0}, sm = 0;
        for (int i = 0; i < len; i++) {
            cnt[time[i] % 60]++;
        }
        if (cnt[0] > 1) sm = (cnt[0] * (cnt[0] - 1)) / 2;
        for (int i = 1; i < 30; i++) {
            sm += (cnt[i] * cnt[60 - i]);
        }
        if (cnt[30] > 1) sm += (cnt[30] * (cnt[30] - 1)) / 2;
        return sm;
    }
};