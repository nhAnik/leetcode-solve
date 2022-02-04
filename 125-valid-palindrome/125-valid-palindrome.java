class Solution {
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            char chi = s.charAt(i), chj = s.charAt(j);
            if (isAlphabet(chi) && isAlphabet(chj)) {
                if (Character.toUpperCase(chi) != Character.toUpperCase(chj)) return false;
                else {
                    i++; j--;
                }
            }
            else if (isNumeric(chi) && isNumeric(chj)) {
                if (chi == chj) {
                    i++; j--;
                } else return false;
            }
            else if (!isAlphabet(chi) && !isNumeric(chi)) i++;
            else if (!isAlphabet(chj) && !isNumeric(chj)) j--;
            else return false;
        }
        return true;
    }

    private boolean isAlphabet(Character ch) {
        return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
    }
    
    private boolean isNumeric(Character ch) {
        return ch >= '0' && ch <= '9';
    }
}