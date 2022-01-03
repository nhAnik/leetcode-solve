class Solution {
public:
    int minCostClimbingStairs(vector<int>& cost) {
        int c0 = 0, c1 = 0, tmp, len = cost.size();
        for (int i = 2; i <= len; i++) {
            tmp = c1;
            c1 = min(c0 + cost[i - 2], c1 + cost[i - 1]);
            c0 = tmp;
        }
        return c1;
    }
};