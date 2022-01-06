class Solution {
public:
    bool carPooling(vector<vector<int>>& trips, int capacity) {
        vector<int> vec(1001, 0);
        int tripLen = 0;
        
        for (vector<int> trip: trips) {
            vec[trip[1]] += trip[0];
            vec[trip[2]] -= trip[0];
            if (trip[2] > tripLen)
                tripLen = trip[2];
        }
        for (int i = 0; i <= tripLen; i++) {
            if (i > 0)
                vec[i] += vec[i - 1];
            if (vec[i] > capacity)
                return false;
        }
        return true;
    }
};