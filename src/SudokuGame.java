public class SudokuGame {

    public static void main(String[] args) {

        SudokuSolver sudokuSolver = new SudokuSolver();
        PrintSudoku printSudoku = new PrintSudoku();

        int[][] board = {
                {7, 0, 2, 0, 5, 0, 6, 0, 0},
                {0, 0, 0, 0, 0, 3, 0, 0, 0},
                {1, 0, 0, 0, 0, 9, 5, 0, 0},
                {8, 0, 0, 0, 0, 0, 0, 9, 0},
                {0, 4, 3, 0, 0, 0, 7, 5, 0},
                {0, 9, 0, 0, 0, 0, 0, 0, 8},
                {0, 0, 9, 7, 0, 0, 0, 0, 5},
                {0, 0, 0, 2, 0, 0, 0, 0, 0},
                {0, 0, 7, 0, 4, 0, 2, 0, 3}
        };

        printSudoku.printBoard(board);

        if (sudokuSolver.solveBoard(board)) {
            System.out.println("\nSolved successfully!\n");
        }
        else {
            System.out.println("\nUnsolvable board :(\n");
        }

        printSudoku.printBoard(board);

    }

}