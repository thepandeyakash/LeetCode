class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();

        char[][] board = new char[n][n];
        for(char[] row: board) Arrays.fill(row, '.');

        solve(0, board, res);
        return res;
    }

    private void solve(int col, char[][] board, List<List<String>> res){
        int n = board.length;
        if(col == n){
            res.add( construct(board));
            return;
        }

        for(int row = 0; row<n; row++){
            if(isSafe(board, row, col)){
                board[row][col] = 'Q';
                solve(col + 1, board, res);
                board[row][col] = '.';

            }
        }
    }


    private boolean isSafe(char[][] board, int row, int col){
        int n = board.length;

        for(int j = 0; j<col; j++){
            if(board[row][j] == 'Q') return false;
        }

        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }

        for (int i = row + 1, j = col - 1; i < n && j >= 0; i++, j--) {
            if (board[i][j] == 'Q') return false;
        }

        return true;
    }

    private List<String> construct(char[][] board) {
        List<String> list = new ArrayList<>();
        for (char[] row : board) list.add(new String(row));
        return list;
    }
}