package Week5;

import java.util.Scanner;

public class EXC2 {
    public static void main(String[] args) {
        int[][] array= getArray();

        System.out.printf("\nSum of all elements is %d",sum(array));

    }

    public static int[][] getArray() {
        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[3][4];

        System.out.printf("Enter %d rows and %d columns:\n", array.length, array[0].length);
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        return array;
    }
    public static int sum(int[][] array){
        int total=0;
        for (int[] ints : array) {
            for (int anInt : ints) {
                total += anInt;
            }
        }
        return total;
    }
}
