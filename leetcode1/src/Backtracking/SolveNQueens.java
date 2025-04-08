package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class SolveNQueens {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        if (n == 0) {
            return res;
        }
        helper(n, 0, new ArrayList<>(), res);
        return res;
    }

    public void helper(int n, int row, List<String> cur, List<List<String>> res) {
        if (row == n) {
            res.add(new ArrayList<>(cur));
            return;
        }
        for (int col = 0; col < n; col++) {
            if (isValid(cur, row, col)) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < n; i++) {
                    if (i == col) {
                        sb.append("Q");
                    } else {
                        sb.append(".");
                    }
                }
                cur.add(sb.toString());
                helper(n, row + 1, cur, res);
                cur.remove(cur.size() - 1);
            }
        }
    }

    public boolean isValid(List<String> cur, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (cur.get(i).charAt(col) == 'Q') {
                return false;
            }
        }
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (cur.get(i).charAt(j) == 'Q') {
               return false;
            }
        }
        for (int i = row - 1, j = col + 1; i >= 0 && j < cur.get(0).length(); i--, j++) {
            if (cur.get(i).charAt(j) == 'Q') {
                return false;
            }
        }
        return true;
    }
}
