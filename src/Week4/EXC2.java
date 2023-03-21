package Week4;

import java.util.Random;

public class EXC2 {
    /**(Game: craps) Craps is a popular dice game played in casinos. Write a program
     to play a variation of the game, as follows:
     Roll two dice. Each die has six faces representing values 1, 2, . . ., and 6, respectively. Check the sum of the two dice.
     If the sum is 2, 3, or 12 (called craps), you lose; if the sum is 7 or 11 (called natural), you win; if the sum is another value
     (i.e., 4, 5, 6, 8, 9, or 10), a point is established. Continue to roll the dice until either
     a 7 or the same point value is rolled. If 7 is rolled, you lose. Otherwise, you win.
     */
    public static void main(String[] args) {
        int[] diceNumbers = new int[]{1, 2, 3, 4, 5, 6};
        Random random = new Random();
        int total = 0, point = 0,tempPoint=0, count = 0, diceOne, diceTwo;
        boolean check = true;
        String answer = "You rolled ";
        while (check) {
            diceOne = diceNumbers[random.nextInt(0, 6)];
            diceTwo = diceNumbers[random.nextInt(0, 6)];
            total = diceOne + diceTwo;
            System.out.println(answer + diceOne + " + " + diceTwo + " = " + total);
            if (loseGame(total,count)) {
                System.out.println("You lose");
                check = false;
            } else if (winGame(total, count)) {
                System.out.println("You win");
                check=false;
            } else {
                count++;
                point = total;
                if (point==7){
                    System.out.println("You lose");
                    break;
                } else if (tempPoint==total) {
                    System.out.println("You win");
                    break;
                }else {
                   tempPoint=point;
                }
                System.out.println("point is " + total);
            }
        }
    }
    // If total is equal to 2-3-12 and count is equal zero ,return true
    public static boolean loseGame(int total,int count) {
        if (count == 0){
            return total == 2 || total == 3 || total == 12;
        }
        return false;
    }
    // If total is equal to 7-11 and count is equal zero , return true
    public static boolean winGame(int total, int count) {
        if (count == 0) {
            return total == 7 || total == 11;
        }
        return false;
    }

}
