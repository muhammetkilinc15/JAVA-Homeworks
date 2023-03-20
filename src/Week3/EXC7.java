package Week3;

import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class EXC7 {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String[] arr = new String[5];
        int count=0;
        long startTime =System.currentTimeMillis();
        for (int i=0;i<5;i++){
            int num1 = random.nextInt(0,10);
            int num2 = random.nextInt(0,10);
            int answer = Math.abs(num1-num2);
            System.out.print("What is "+Math.max(num1,num2)+" - "+Math.min(num1,num2)+"?");
            int userAnswer=scanner.nextInt();
            if (userAnswer==answer){
                System.out.println("You are correct!");
                arr[i]=Math.max(num1,num2)+" - "+Math.min(num1,num2)+" = "+userAnswer+" correct";
                count++;
            }else {
                System.out.println("Your answer is wrong.");
                System.out.println(Math.max(num1,num2) +" - "+Math.min(num1,num2)+" should be "+answer);
                arr[i]=Math.max(num1,num2)+" - "+Math.min(num1,num2)+" = "+userAnswer+" false";
            }
        }
        long finishTime =System.currentTimeMillis();
        System.out.println("Correct count is "+count);
        System.out.println("Test time is "+(((finishTime-startTime)/1000)%60)+" seconds");
        for (String a:arr) {
            System.out.println(a);
        }
    }
}
