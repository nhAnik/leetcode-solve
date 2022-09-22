class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] strings = s.split(" ");
        int idx = 0;
        for (String split : strings) {
            idx++;
            for (int i = split.length() - 1; i >= 0; i--) sb.append(split.charAt(i));
            if (idx < strings.length) sb.append(' ');
        }
        return sb.toString();
    }
}