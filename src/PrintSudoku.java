public class PrintSudoku {

    public void printBoard(int[][] board) {
        int boardSize = 9;
        for (int row = 0; row < boardSize; row++) {
            if (row % 3 == 0 && row != 0) {
                System.out.println("----------------------");
            }
            for (int column = 0; column < boardSize; column++) {
                if (column % 3 == 0 && column != 0) {
                    System.out.print(" |");
                }
                System.out.printf(" %d", board[row][column]);
            }
            System.out.println();
        }
    }
}
