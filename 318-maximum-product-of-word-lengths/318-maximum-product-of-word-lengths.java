class Solution {
    public int maxProduct(String[] words) {
        int len = words.length;
        int[][] bits = new int[len][2];
        for (int i = 0; i < len; i++) {
            String word = words[i];
            int bit = 0;
            for (char ch: word.toCharArray()) {
                bit |= 1 << (ch - 'a');
            }
            bits[i][0] = bit;
            bits[i][1] = word.length();
        }
        int ans = 0;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len; j++) {
                if ((bits[i][0] & bits[j][0]) == 0)
                    ans = Integer.max(ans, bits[i][1] * bits[j][1]);
            }
        }
        return ans;
    }
}