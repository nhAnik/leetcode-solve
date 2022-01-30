class Solution {
    public int addDigits(int num) {
        if (num < 10) return num;
        int sm = 0;
        while (num > 0) {
            sm += (num % 10);
            num /= 10;
        }
        return addDigits(sm);
    }
}