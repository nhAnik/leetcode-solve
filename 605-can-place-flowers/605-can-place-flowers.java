class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int flowers = 0, cnt = 0;
        boolean one = false;
        for (int x: flowerbed) {
            if (x == 1) {
                if (cnt > 0) flowers += (one ? (cnt - 1) / 2: cnt / 2);
                cnt = 0;
                one = true;
            } else cnt++;
        }
        if (cnt > 0) flowers += cnt / 2;
        if (!one) flowers = (cnt + 1) / 2;
        return flowers >= n;
    }
}