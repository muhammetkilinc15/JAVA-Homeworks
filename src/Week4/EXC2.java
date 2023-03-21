package Week4;

import java.util.Random;

public class EXC2 {
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
    public static boolean loseGame(int total,int count) {
        if (count == 0){
            return total == 2 || total == 3 || total == 12;
        }
        return false;
    }
    public static boolean winGame(int total, int count) {
        if (count == 0) {
            return total == 7 || total == 11;
        }
        return false;
    }

}
