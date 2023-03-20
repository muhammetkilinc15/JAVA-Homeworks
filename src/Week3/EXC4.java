package Week3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class EXC4 {
    private static final DecimalFormat decimalFormat = new DecimalFormat("0.00");
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Emploee's name: ");
            String name = scanner.nextLine();
            System.out.print("Number of hours worked in a week: ");
            double hours = scanner.nextDouble();
            System.out.print("Enter hourly rate: ");
            double hourlyRate=scanner.nextDouble();
            System.out.print("Enter federal tax withholding rate: ");
            double federalTax=scanner.nextDouble();
            System.out.print("Enter state tax withholding rate: ");
            double stateTax= scanner.nextDouble();
            System.out.println("Emploee's name: "+name);
            System.out.println("Hours worked: "+hours);
            System.out.println("Pay rate: $"+hourlyRate);
            double grossPay=hourlyRate*hours;
            System.out.println("Gross Pay: $"+  grossPay);
            System.out.println("Deductions: ");
            System.out.println("\tFederal withholding ("+federalTax*100+"): "+grossPay*federalTax+"$");
            System.out.println("\tState withholding ("+stateTax*100+"): "+decimalFormat.format(grossPay*stateTax)+"$");
            System.out.println("Net Pay: $"+decimalFormat.format(grossPay-(grossPay*federalTax+grossPay*stateTax)));
        }catch (Exception e){
            System.out.println(e.getClass().getSimpleName());
        }

    }
}
