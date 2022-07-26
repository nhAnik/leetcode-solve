class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        return searchMatrixUtil(matrix, target, 0, 0, m - 1, n - 1);
    }

    private boolean searchMatrixUtil(int[][] matrix, int target, int r1, int c1, int r2, int c2) {
        if (!isValidRow(r1, matrix.length) || !isValidRow(r2, matrix.length)
                || !isValidCol(c1, matrix[0].length) || !isValidCol(c2, matrix[0].length))
            return false;
        if (r1 == r2 && c1 == c2) return matrix[r1][c1] == target;
        if (target < matrix[r1][c1] || target > matrix[r2][c2]) return false;
        int rm = (r1 + r2) / 2, cm = (c1 + c2) / 2;
        return searchMatrixUtil(matrix, target, r1, c1, rm, cm) ||
                searchMatrixUtil(matrix, target, r1, cm + 1, rm, c2) ||
                searchMatrixUtil(matrix, target, rm + 1, c1, r2, cm) ||
                searchMatrixUtil(matrix, target, rm + 1, cm + 1, r2, c2);
    }
    
    private boolean isValidRow(int r, int rows) {
        return r >= 0 && r < rows;
    }

    private boolean isValidCol(int c, int cols) {
        return c >= 0 && c < cols;
    }
}