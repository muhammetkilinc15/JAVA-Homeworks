package Week2;

import java.math.RoundingMode;
import java.util.Scanner;

public class EXC5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the annual interest rate: ");
        double annualRate=scanner.nextDouble();
        System.out.print("Enter the number of years as an integer: ");
        int years= scanner.nextInt();
        System.out.print("Enter loan amount(USD): ");
        double amount=scanner.nextDouble();
        double monthlyRate =  annualRate / 1200;

        // Calculate montly payment
        double monthlyPayment = amount * monthlyRate / (1 - (1 /
                Math.pow(1 + monthlyRate, years * 12)));
        double totalPayment = monthlyPayment*12*years;
        System.out.println("The monthly payment is $"+monthlyPayment);
        System.out.println("The total payment is $"+totalPayment);

    }
}
