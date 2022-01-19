class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid[0][0] == 1)
            return 0;
        int m = obstacleGrid.length, n = obstacleGrid[0].length;
        obstacleGrid[0][0] = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) continue;
                if (obstacleGrid[i][j] == 0) {
                    if (i > 0) obstacleGrid[i][j] += obstacleGrid[i - 1][j];
                    if (j > 0) obstacleGrid[i][j] += obstacleGrid[i][j - 1];
                } else
                    obstacleGrid[i][j] = 0;
            }
        }
        return obstacleGrid[m - 1][n - 1];
    }
}