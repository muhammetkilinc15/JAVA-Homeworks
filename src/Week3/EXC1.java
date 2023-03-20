package Week3;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class EXC1 {
    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber = random.nextInt(100, 1000);
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println(randomNumber);
            System.out.print("Enter your guess: ");
            int guessNumber = scanner.nextInt();
            competetionResults(guessNumber,randomNumber);
        }catch (InputMismatchException ex){
            System.out.println(ex.getClass().getSimpleName());
        }
    }
    private static void competetionResults(int guessNumber, int randomNumber) {
        boolean check = true;
        int[] randomNumberDigits = new int[3];
        int[] guessNumberDigits = new int[3];
        int tempRandom=randomNumber;
        if (guessNumber!=randomNumber){
            check=false;
        }
        for (int i = 2; i >= 0; i--) {
            randomNumberDigits[i] = randomNumber % 10;
            guessNumberDigits[i] = guessNumber % 10;
            randomNumber /= 10;
            guessNumber /= 10;
        }
        int count = 0;
        for (int i = 0; i < guessNumberDigits.length; i++) {
            for (int j = 0; j < randomNumberDigits.length; j++) {

                if ((guessNumberDigits[i]==randomNumberDigits[j])){
                    count++;
                    randomNumberDigits[j]=-1;
                    break;
                }
            }
        }
        int money=0;
        if (count==3 && check){
           money=10000;
        } else if (count==3) {
            money=3000;
        } else if (count==2) {
            money=1000;
        }
        if (count>1){
            String answer = "You win!!! Number to be predicted is " + tempRandom;
            String result = "match: you win "+money+"TL";
            System.out.println(answer);
            if (count==3 && check){
                System.out.println("Exact "+result);
            } else if (count==2){
                System.out.println("Two "+result);
            }else if (count==3){
                System.out.println("All digit "+result);
            }
        }else {
            System.out.println("You lose!!!");
        }
    }
}