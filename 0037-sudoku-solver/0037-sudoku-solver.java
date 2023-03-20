class Solution {
    public void solveSudoku(char[][] board) {
        if (board == null || board.length == 0)
            return;
        solve(board);
    }
    public boolean solve(char[][] board){
        for (int i = 0; i< board.length; i++ ){
            for (int j=0; j<board[0].length; j++){
                if (board[i][j] == '.'){
                    for(char c = '1'; c<='9'; c++){ //trial. Try 1 through 9
                        if(isValid(board,i,j,c)){
                            board[i][j] = c;    // put c for this cell
                            if (solve(board))
                                return true;    //If it is the solution then rerturn true.
                            else
                                board[i][j] = '.';  // otherwise GoBack (BackTracking)
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    private boolean isValid(char[][] board, int row, int col, char c){
        int nRow = 3 * (row/3);     // normalized row
        int nCol = 3 * (col/3);     // normalized coloumn
        for(int i=0; i<9; i++){
            if (board[i][col] == c) return false;   // check row
            if (board[row][i] == c) return false;   //check col
            if (board[nRow + i / 3][nCol + i % 3] == c) return false;   // check 3x3 block
        }
        return true;
    }
}