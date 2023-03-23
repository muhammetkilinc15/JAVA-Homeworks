package Week4;

import java.util.Scanner;

public class EXC5 {
    /**  Write a method that finds the number of occurrences of a specified character

      public static int count(String str, char a)

     For example, count("Congratulations", 'o') returns 2. Write a test program that prompts the user
     to enter a string followed by a character and displays the number of occurrences of the
     character in the string.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a world: ");
        String str = scanner.nextLine();
        System.out.print("Enter a character:");
        char a = scanner.nextLine().charAt(0);

        System.out.println("The number of occurrences of \'" + a + "\' in \""+str+"\" is "+count(str,a));

    }

    public static int count(String str, char a) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a) {
                count++;
            }
        }
        return count;
    }
}
