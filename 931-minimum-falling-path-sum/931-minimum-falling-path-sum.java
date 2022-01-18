class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length, minVal;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                minVal = matrix[i - 1][j];
                if (j - 1 >= 0) minVal = Math.min(minVal, matrix[i - 1][j - 1]);
                if (j + 1 < n) minVal = Math.min(minVal, matrix[i - 1][j + 1]);
                matrix[i][j] += minVal;
            }
        }
        minVal = matrix[n - 1][0];
        for (int i = 1; i < n; i++)
            minVal = Math.min(minVal, matrix[n - 1][i]);
        return minVal;
    }
}