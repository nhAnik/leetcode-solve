class Solution {
    public String reverseWords(String s) {
        char[] chars = s.toCharArray();
        int start = 0;
        int len = chars.length;
        for (int end = 0; end < len; end++) {
            if (chars[end] == ' ' || end == len - 1) {
                int l = start, r = end == len - 1 ? end : end - 1;
                while (l < r) {
                    char tmp = chars[l];
                    chars[l] = chars[r];
                    chars[r] = tmp;
                    l++; r--;
                }
                start = end + 1;
            }
        }
        return new String(chars);
    }
}