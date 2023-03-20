package Week3;

import java.util.Scanner;

public class EXC2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter binary digits: ");
        String number= scanner.nextLine();
        if (binaryToDecimal(number)!=0)
        System.out.println("The decimal value: "+ binaryToDecimal(number));

    }
    private static long binaryToDecimal(String number){
        int result=0;
        try {
            long binary= Long.parseLong(number);
            for (int i=0;i<number.length();i++){
                long digit=binary%10;
                result += Math.pow(2,i)*digit;
                binary=binary/10;
            }

        }catch (Exception e){
            System.out.println(e.getClass().getSimpleName());
        }
        return result;
    }
}
