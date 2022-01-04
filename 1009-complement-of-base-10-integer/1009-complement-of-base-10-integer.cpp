class Solution {
public:
    int bitwiseComplement(int n) {
        if (n == 0) return 1;
        int ans = 0, mulp = 1;
        while (n > 0) {
            if (n % 2 == 0) {
                ans += mulp;
            }
            n /= 2;
            mulp *= 2;
        }
        return ans;
    }
};