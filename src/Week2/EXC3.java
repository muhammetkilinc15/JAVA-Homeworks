package Week2;

import java.util.Scanner;

public class EXC3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        int number=scanner.nextInt();
        int result=1,tempNumber=number;
        if (number>0 && number<1000){
            while (number>0){
                result *= number%10;
                number/=10;
            }
            System.out.print("The multiplication of all digits in "+tempNumber+ " is "+result);
        }else {
            System.out.println(number +" is not between 0 and 1000");
        }
    }
}
