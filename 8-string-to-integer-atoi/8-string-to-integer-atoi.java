class Solution {
    public int myAtoi(String s) {
        boolean isNeg = false;
        int i = 0, len = s.length(), digit;
        long num = 0;
        while (i < len && s.charAt(i) == ' ') i++;
        if (i < len && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            if (s.charAt(i) == '-') isNeg = true;
            i++;
        }

        while (i < len && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            digit = s.charAt(i) - '0';
            num = num * 10 + digit;
            if (!isNeg && num > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (isNeg && -num < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            i++;
        }

        if (isNeg) num = -num;
        return (int) num;
    }
    
}