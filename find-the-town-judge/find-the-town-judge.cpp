class Solution {
public:
    int findJudge(int n, vector<vector<int>>& trust) {
        vector<int> trusted(1001, 0), trusts(1001, 0);
        
        for (auto vec: trust) {
            trusts[vec[0]]++;
            trusted[vec[1]]++;
        }
        
        for (int i = 1; i <= n; i++)
            if (trusted[i] == n - 1 && trusts[i] == 0)
                return i;
        return -1;
    }
};