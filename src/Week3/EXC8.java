package Week3;

import java.util.Scanner;

public class EXC8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = scanner.nextInt();
        int smallest = Math.min(num1, num2);
        for (int i = smallest; i >= 1; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                System.out.println("The greatest common divisor for "+num1 +" and "+num2 +" is "+i);
                break;
            }
        }
    }
}
