class Solution {
    public char findTheDifference(String s, String t) {
        int val = 0;
        for (Character ch: t.toCharArray())
            val = val ^ ch;
        for (Character ch: s.toCharArray())
            val = val ^ ch;
        return (char) (val);
    }
}