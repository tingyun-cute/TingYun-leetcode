package backtracking;

public class Exist {
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (helper(board, word, i, j, 0)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean helper(char[][] board, String word, int i, int j, int index) {
        // 结束条件
        if (index == word.length()) {
            return true;
        }

        // 剪枝
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(index)) {
            return false;
        }

        char tmp = board[i][j];
        board[i][j] = '*';

        // 4 directions search (down, up, right, left)
        if (helper(board, word, i + 1, j, index + 1) ||
                helper(board, word, i - 1, j, index + 1) ||
                helper(board, word, i, j + 1, index + 1) ||
                helper(board, word, i, j - 1, index + 1)) {
            return true;
        }

        board[i][j] = tmp;
        return false;
    }
}
