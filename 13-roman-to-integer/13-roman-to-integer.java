class Solution {
    public int romanToInt(String s) {
        Character prev = s.charAt(0), cur;
        int val = roman(prev), len = s.length();
        for (int i = 1; i < len; i++) {
            cur = s.charAt(i);
            if (roman(cur) > roman(prev)) {
                val -= 2 * roman(prev);
            }
            val += roman(cur);
            prev = cur;
        }
        return val;
    }
    
    private int roman(Character ch) {
        switch (ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return -1;
    }
}