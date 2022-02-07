class Solution {
    public char findTheDifference(String s, String t) {
        int[] cnt = new int[26];
        char c = 'a';
        for (Character ch: t.toCharArray())
            cnt[ch - 'a']++;
        for (Character ch: s.toCharArray())
            cnt[ch - 'a']--;
        for (int i = 0; i < 26; i++)
            if (cnt[i] == 1)
                c = (char) ('a' + i);
        return c;
    }
}