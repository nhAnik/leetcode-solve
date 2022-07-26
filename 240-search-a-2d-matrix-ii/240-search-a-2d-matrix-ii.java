class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length, i = 0;
        for (int[] row: matrix) {
            if (target >= matrix[i][0] && target <= matrix[i][n - 1] &&
                    Arrays.binarySearch(row, target) >= 0) return true;
            i++;
        }
        return false;
    }
}