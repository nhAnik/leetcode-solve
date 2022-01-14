class Solution {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0"))
            return "0";
        
        num1 = new StringBuilder(num1).reverse().toString();
        num2 = new StringBuilder(num2).reverse().toString();
        StringBuilder multiplier = new StringBuilder();
        String ans = "0";
        int len1 = num1.length(), len2 = num2.length(), digit, carry;
        for (int i = 0; i < len1; i++) {
            StringBuilder sb = new StringBuilder(multiplier);
            carry = 0;
            for (int j = 0; j < len2; j++) {
                digit = ((num1.charAt(i) - '0') * (num2.charAt(j) - '0')) + carry;
                carry = digit / 10;
                sb.append(digit % 10);
            }
            if (carry != 0)
                sb.append(carry);
            multiplier.append("0");
            ans = add(ans, sb.toString());
        }
        return new StringBuilder(ans).reverse().toString();
    }

    private String add(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int len1 = num1.length(), len2 = num2.length(), carry = 0, digit;
        for (int i = 0; i < Math.max(len1, len2); i++) {
            if (i < Math.min(len1, len2))
                digit = (num1.charAt(i) - '0') + (num2.charAt(i) - '0') + carry;
            else if (i >= len1)
                digit = (num2.charAt(i) - '0') + carry;
            else
                digit = (num1.charAt(i) - '0') + carry;
            carry = digit / 10;
            sb.append(digit % 10);
        }
        if (carry != 0) sb.append(carry);
        return sb.toString();
    }
}