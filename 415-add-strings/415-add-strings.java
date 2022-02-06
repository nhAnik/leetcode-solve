class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int carry = 0, digit;
        for (int i = num1.length() - 1, j = num2.length() - 1; i >= 0 || j >= 0; i--, j--) {
            if (i < 0) digit = num2.charAt(j) - '0' + carry;
            else if (j < 0) digit = num1.charAt(i) - '0' + carry;
            else digit = num1.charAt(i) - '0' + num2.charAt(j) - '0' + carry;
            carry = digit / 10;
            sb.append(digit % 10);
        }
        if (carry != 0) sb.append(carry);
        return sb.reverse().toString();
    }
}