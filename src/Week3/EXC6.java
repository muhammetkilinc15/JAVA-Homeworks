package Week3;

import java.util.Random;
import java.util.Scanner;

public class EXC6 {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomNumber = random.nextInt(1, 100);
        System.out.println("Guess a magic number between 0 and 100");
        int number;
        try {
            do {
                System.out.print("Enter your guess: ");
                number = scanner.nextInt();
                if (number > 0 && number < 100) {
                    if (number > randomNumber) {
                        System.out.println("Your guess is too high");
                    } else if (number == randomNumber) {
                        System.out.println("Yes,the number is " + randomNumber);

                    } else {
                        System.out.println("Your guess is too low");
                    }
                } else {
                    System.out.println("The number you entered is not between 0 and 100");
                }
            } while (number != randomNumber);
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
