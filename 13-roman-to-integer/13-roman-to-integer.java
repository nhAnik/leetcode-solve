class Solution {
    public int romanToInt(String s) {
        int val = 0, len = s.length();
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == 'I') {
                val++;
                if (i + 1 < len && s.charAt(i + 1) == 'V') {
                    val += 3;
                    i++;
                }
                else if (i + 1 < len && s.charAt(i + 1) == 'X') {
                    val += 8;
                    i++;
                }
            }
            else if (s.charAt(i) == 'V') val += 5;
            else if (s.charAt(i) == 'X') {
                val += 10;
                if (i + 1 < len && s.charAt(i + 1) == 'L') {
                    val += 30;
                    i++;
                } else if (i + 1 < len && s.charAt(i + 1) == 'C') {
                    val += 80;
                    i++;
                }
            }
            else if (s.charAt(i) == 'L') val += 50;
            else if (s.charAt(i) == 'C') {
                val += 100;
                if (i + 1 < len && s.charAt(i + 1) == 'D') {
                    val += 300;
                    i++;
                } else if (i + 1 < len && s.charAt(i + 1) == 'M') {
                    val += 800;
                    i++;
                }
            }
            else if (s.charAt(i) == 'D') val += 500;
            else if (s.charAt(i) == 'M') val += 1000;
        }
        return val;
    }
}