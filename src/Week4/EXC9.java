package Week4;

import java.util.Random;

public class EXC9 {
    public static void main(String[] args) {
         EightQueens eightQueens = new EightQueens();
         eightQueens.solve();
         eightQueens.printBoard();





    }

}
class EightQueens{

    private static final int BOARD_SIZE = 8;
    private static int[][] board = new int[BOARD_SIZE][BOARD_SIZE];

    public boolean solve() {
        // Çözümü bulmak için solveRecursive fonksiyonunu çağırırız.
        // Eğer çözüm bulunursa true, bulunamazsa false döndürür.
        return solveRecursive(0);
    }

    private boolean solveRecursive(int col) {
        // Tüm sütunlar doldurulduysa, çözüm bulunmuştur.
        if (col == BOARD_SIZE) {
            return true;
        }
        // Sırayla her bir satırı deneyerek vezirleri tahtaya yerleştiririz.
        for (int row = 0; row < BOARD_SIZE; row++) {
            // Vezirin konumlandırılması güvenli ise, veziri tahtaya yerleştiririz.
            if (isSafe(row, col)) {
                board[row][col] = 1;
                // Sonraki sütuna geçeriz ve çözüm bulunana kadar işlemi tekrarlarız.
                if (solveRecursive(col + 1)) {
                    return true;
                }
                // Eğer sonraki sütun için çözüm bulunamazsa, veziri çıkarırız ve
                // başka bir satırda yeniden denemek üzere tekrarlıyoruz.
                board[row][col] = 0;
            }
        }
        // Eğer hiçbir satırda vezir güvenli bir şekilde konumlandırılamazsa,
        // geri izleme işlemine başvurarak önceki sütuna döneriz ve
        // farklı bir satırda yeniden denemek için tekrarlanır.
        return false;
    }

    private boolean isSafe(int row, int col) {
        // Vezirin diğer vezirler tarafından tehdit edilmediğini kontrol ederiz.
        // Sütunda başka vezirler olmadığını kontrol ederiz.
        for (int i = 0; i < col; i++) {
            if (board[row][i] == 1) {
                return false;
            }
        }
        // Sol üst köşegedeki kesişen çizgi boyunca başka vezirler olmadığını kontrol ederiz.
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        // Sol alt köşegen boyunca başka vezirler olmadığını kontrol ederiz.
        for (int i = row, j = col; j >= 0 && i < BOARD_SIZE; i++, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        // Vezir güvende olduğu için true döndürürüz.
        return true;
    }
    public void printBoard() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                if (board[i][j] == 1) {
                    System.out.print("Q ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }
}






