class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt(b -> b[1]));
        int count = 0, len = points.length, j, i = 0;
        while (i < len) {
            count++;
            j = i + 1;
            while (j < len && points[j][0] <= points[i][1])
                j++;
            i = j;
        }
        return count;
    }
}