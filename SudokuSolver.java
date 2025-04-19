// Sudoku Solver using Backtracking in Java
class SolveSudoku {
    // Function to check if a number can be placed in the given cell
    public boolean isSafe(char[][] board, int row, int col, int number) {
        char ch = (char)(number + '0');
        //column and row
        for(int i = 0; i < board.length; i++) {
            if(board[i][col] == ch || board[row][i] == ch) {
                return false;
            }
        }

        //grid
        int sr = 3 * (row/3);
        int sc = 3 * (col/3);
        
        for(int i = sr; i < sr+3; i++) {
            for(int j = sc; j < sc+3; j++) {
                if(board[i][j] == ch) {
                    return false;
                }
            }
        }

        return true;

    }

    // Function to solve the Sudoku using backtracking
    // It fills the board with numbers from 1 to 9 in a valid way
    public boolean solve(char[][] board, int row, int col) {
        if(row == board.length) {
            return true;
        }
        
        int nrow = 0;
        int ncol = 0;
        
        if(col == board.length-1) {
            nrow = row + 1;
            ncol = 0;
        } 
        else {
            nrow = row;
            ncol = col + 1;
        }
        
        if(board[row][col] != '.') {
            return solve(board, nrow, ncol);
        } 
        else {
            //fill the place
            for(int i = 1; i <= 9; i++) {
                if(isSafe(board, row, col, i)) {
                    board[row][col] = (char)(i+'0');
                    if(solve(board, nrow, ncol)){
                        return true;
                    } 
                    else {
                        //backtrack
                        board[row][col] = '.';
                    }
                }
            }
        }

        return false;
    }

    // Function to print the Sudoku board
    public void printSodoku(char[][] board) {
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}


public class SudokuSolver{
    public static void main(String[] args) {
        char[][] board = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        
        SolveSudoku solver = new SolveSudoku();
        if(solver.solve(board, 0, 0)) {
            System.out.println("Sudoku solved successfully!");
            System.out.println("Sudoku Board:");
            solver.printSodoku(board);
        }
        else{
            System.out.println("No solution exists for the given Sudoku puzzle.");
        }
    }
}
