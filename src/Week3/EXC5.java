package Week3;

import java.util.Random;
import java.util.Scanner;

public class EXC5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int num1 = random.nextInt(1, 10);
        int num2 = random.nextInt(1, 10);

        int answer = num1 + num2;
        try {
            System.out.print("What is " + num1 + " + " + num2 + "?");
            int number = scanner.nextInt();
            while (number != answer) {

                System.out.print("Wrong answer.Try again.What is " + num1 + " + " + num2 + "?");
                number = scanner.nextInt();
            }
            System.out.println("You got it!");
        }catch (Exception e){
            System.out.println(e.getClass().getSimpleName());
        }

    }
}
