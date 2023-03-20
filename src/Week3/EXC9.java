package Week3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class EXC9 {
    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter tuition amount: ");
        double amount = scanner.nextDouble();
        System.out.print("Enter yearly increase percentage: ");
        double yearlyPercentage=(scanner.nextDouble()+100)/100;
        int year=0;
        double tempAmount=amount;
        while (amount<tempAmount*2){
            amount*=yearlyPercentage;
            year++;
        }
        System.out.println("Tuition will be doubled in "+ year + " years");
        System.out.println("Tution will be $"+decimalFormat.format(amount)+" in "+year+" years");
    }
}
