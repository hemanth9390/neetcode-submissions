class Solution {
    public boolean isValidSudoku(char[][] board) {
         for (int i = 0; i < board.length; i++) {
            HashSet<Character> set = new HashSet<>();
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                if (set.contains(board[i][j])) {
                    return false;
                }
                set.add(board[i][j]);
            }
        }
        for (int j = 0; j < board.length; j++) {
            HashSet<Character> set = new HashSet<>();
            for (int i = 0; i < board.length; i++) {
                if (board[i][j] == '.') {
                    continue;
                }
                if (set.contains(board[i][j])) {
                    return false;
                }
                set.add(board[i][j]);
            }
        }
        for (int k = 0; k < board.length; k++) {
            HashSet<Character> set = new HashSet<>();
            for (int i = (k / 3) * 3; i < (k / 3) * 3 + 3; i++) {
                for (int j = (k % 3) * 3; j < (k % 3) * 3 + 3; j++) {
                    if (board[i][j] == '.') {
                        continue;
                    }
                    if (set.contains(board[i][j])) {
                        return false;
                    }
                    set.add(board[i][j]);
                }
            }
        }
        return true;
    }
}
