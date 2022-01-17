class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] map = new String[26];
        String[] split = s.split(" ");
        int len = pattern.length(), idx;
        if (len != split.length)
            return false;

        for (int i = 0; i < len; i++) {
            idx = pattern.charAt(i) - 'a';
            if (map[idx] == null) {
                for (int j = 0; j < 26; j++) {
                    if (split[i].equals(map[j]))
                        return false;
                }
                map[idx] = split[i];
            } else if (!map[idx].equals(split[i])) {
                return false;
            }
        }
        return true;
    }
}