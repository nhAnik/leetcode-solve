class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length, cols = matrix[0].length;
        if (target < matrix[0][0] || target > matrix[rows - 1][cols - 1]) return false;
        int r = rows - 1, c = 0;
        while (r >= 0 && c < cols) {
            if (matrix[r][c] == target) return true;
            else if (target < matrix[r][c]) r--;
            else c++;
        }
        return false;
    }
}