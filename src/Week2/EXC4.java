package Week2;

import java.util.Scanner;

public class EXC4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        long minutes = scanner.nextLong();
        int year = (int) minutes/(365*24*60);
        int day = (int) (minutes-(year*365*24*60)) / (24*60);
        System.out.println(minutes +" minutes is approximately "+year +" years and "+day +" days");
    }
}
