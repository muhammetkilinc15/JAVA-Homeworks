package Week4;


public class EXC8 {


    // The size of the chessboard
    private static final int BOARD_SIZE = 8;

    // The board represented as a one-dimensional array
    private static int[] board = new int[BOARD_SIZE];

    // The solution counter
    private static int solutions = 1;

    public static void main(String[] args) {
        solve(0);
        System.out.println("Total solutions: " + (solutions-1));
    }

    // Recursive method to place the queens
    private static void solve(int row) {
        // If we've placed all the queens, print the solution
        if (row == BOARD_SIZE) {
            printSolution();

            solutions++;
            return;
        }
        
        // Try placing a queen in each column of this row
        for (int col = 0; col < BOARD_SIZE; col++) {
            if (isValidPlacement(row, col)) {
                board[row] = col;
                solve(row + 1);
            }
        }
    }

    // Check if it's valid to place a queen at the given row and column
    private static boolean isValidPlacement(int row, int col) {
        for (int i = 0; i < row; i++) {
            // Check if the queen in this row is in the same column or on the same diagonal
            if (board[i] == col || Math.abs(board[i] - col) == Math.abs(i - row)) {
                return false;
            }
        }
        return true;
    }

    // Print the board with queens in their positions
    private static void printSolution() {
        System.out.println("Solution #" + solutions + ":");
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                if (board[i] == j) {
                    System.out.print("|Q");
                } else {
                    System.out.print("| ");
                }
                if (j == BOARD_SIZE - 1) {
                    System.out.print("|");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}

