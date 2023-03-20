package Week2;

import java.util.Scanner;

public class EXC6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter retrival amount: ");
        double money = scanner.nextDouble();
        int twoHundredMoney = (int) money / 200;
        money -= twoHundredMoney * 200;
        int oneHundredMoney = (int) (money) / 100;
        money -=oneHundredMoney * 100;
        int fiftyMoney = (int) money / 50;
        money -= fiftyMoney * 50;
        int twentyMoney = (int) money / 20;
        money -= twentyMoney * 20;
        int tenMoney = (int) money / 10;
        money -= tenMoney * 10;
        int fiveMoney = (int) money / 5;
        money -= fiveMoney * 5;
        int oneMoney = (int) money;
        money -= oneMoney;
        int fiftyKr = (int) (money / 0.5);
        money -= fiftyKr* 0.5;
        int twenyfiftyKr = (int) (money / 0.25);
        String result = twoHundredMoney + " x 200TL, " + oneHundredMoney + " x 100TL, " + fiftyMoney + " x 50TL, " + twentyMoney + " x 20TL, " + tenMoney + " x 10TL, " + fiveMoney + " x 5TL, " + oneMoney + " x 1TL, " + fiftyKr + " x 50 KR , " + twenyfiftyKr + " x 25KR ";
        System.out.println("Monetary units to be given: " + result);
    }
}
