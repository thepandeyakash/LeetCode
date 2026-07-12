class Solution {
    public boolean isValidSudoku(char[][] board) {

        for(int i = 0; i<9; i++){
            Set<Integer> seen = new HashSet<>();
            for(int j = 0; j<9; j++){
                if(board[i][j] == '.') continue;
                int k = board[i][j];
                if(seen.contains(k)) return false;
                seen.add(k);
            }
        }
        for(int i = 0; i<9; i++){
            Set<Integer> seen = new HashSet<>();
            for(int j = 0; j<9; j++){
                if(board[j][i] == '.') continue;
                int k = board[j][i];
                if(seen.contains(k)) return false;
                seen.add(k);
            }
        }
        for(int i = 0; i<9; i++){
            Set<Character> seen = new HashSet<>();
            for(int j = 0; j<3; j++){
                for(int k = 0; k<3; k++){
                    int row = (i/3) *3 + j;
                    int col = (i%3) * 3 + k;
                    if (board[row][col] == '.') continue;
                    if (seen.contains(board[row][col])) return false;
                    seen.add(board[row][col]);
                }
            }
        }

        return true;

    }
}