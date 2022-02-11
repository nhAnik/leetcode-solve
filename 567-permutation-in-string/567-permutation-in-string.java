class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int ln1 = s1.length(), ln2 = s2.length();
        if (ln1 > ln2)
            return false;
        int[] freq1 = new int[26], freq2 = new int[26];
        for (Character ch: s1.toCharArray()) freq1[ch - 'a']++;
        for (int i = 0; i < ln1; i++)
            freq2[s2.charAt(i) - 'a']++;
        
        for (int i = 0; i <= ln2 - ln1; i++) {
            if (Arrays.equals(freq1, freq2)) return true;
            freq2[s2.charAt(i) - 'a']--;
            if (i + ln1 < ln2)
                freq2[s2.charAt(i + ln1) - 'a']++;
        }
        return false;
    }
}