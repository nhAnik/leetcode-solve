class Solution {
    private int[][] matrix;
    private int rows;
    private int cols;

    public boolean searchMatrix(int[][] matrix, int target) {
        this.matrix = matrix;
        this.rows = matrix.length;
        this.cols = matrix[0].length;
        return searchMatrixUtil(target, 0, 0, rows - 1, cols - 1);
    }

    private boolean searchMatrixUtil(int target, int r1, int c1, int r2, int c2) {
        if (!isValidRow(r1) || !isValidRow(r2) || !isValidCol(c1) || !isValidCol(c2))
            return false;
        if (r1 == r2 && c1 == c2) return matrix[r1][c1] == target;
        if (target < matrix[r1][c1] || target > matrix[r2][c2]) return false;
        int rm = (r1 + r2) / 2, cm = (c1 + c2) / 2;
        return searchMatrixUtil(target, r1, c1, rm, cm) ||
                searchMatrixUtil(target, r1, cm + 1, rm, c2) ||
                searchMatrixUtil(target, rm + 1, c1, r2, cm) ||
                searchMatrixUtil(target, rm + 1, cm + 1, r2, c2);
    }

    private boolean isValidRow(int r) {
        return r >= 0 && r < rows;
    }

    private boolean isValidCol(int c) {
        return c >= 0 && c < cols;
    }
}