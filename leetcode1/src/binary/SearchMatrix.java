package binary;

public class SearchMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        return helper(matrix, target, matrix.length - 1, matrix[0].length - 1);
    }

    private boolean helper(int[][] matrix, int target, int row, int col) {
        if (row < 0 || row >= matrix.length || col < 0 || col >= matrix[0].length) {
            return false;
        }
        if (matrix[row][col] == target) {
            return true;
        }
        if (matrix[row][col] > target) {
            return helper(matrix, target, row - 1, col) || helper(matrix, target, row, col - 1);
        }
        return false;
    }
}
