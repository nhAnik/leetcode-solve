class Solution {
public:
    int rob(vector<int>& nums) {
        int c0 = 0, c1 = 0, len = nums.size(), tmp;
        for (int i = 0; i < len; i++) {
            tmp = c1;
            c1 = max(c0 + nums[i], c1); 
            c0 = tmp;
        }
        return c1;
    }
};