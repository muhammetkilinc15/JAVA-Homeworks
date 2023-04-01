package Week5;

import java.util.Scanner;
 /*
 (The Location class) Design a class named Location for locating a maximal
 value and its location in a two-dimensional array. The class contains public data
 fields row, column, and maxValue that store the maximal value and its indices in
 a two-dimensional array with row and column as int types and maxValue as a
 double type.
 Write the following method that returns the location of the largest element in a
 two-dimensional array:
 public static Location locateLargest(double[][] a)
 The return value is an instance of Location. Write a test program that prompts
 the user to enter a two-dimensional array and displays the location of the largest
 element in the array.
 */
public class EXC8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number rows and colums in the array: ");
        int row = scanner.nextInt();
        int col = scanner.nextInt();

        double[][] arr = new double[row][col];
        System.out.println("Enter the array: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scanner.nextDouble();
            }
        }
        Location locationMax = locationLargest(arr);
        System.out.printf("The location of the largest element is %s  at (%d,%d)",locationMax.maxValue,locationMax.row,locationMax.col);
    }
    public static Location locationLargest(double[][] array) {
        return new Location(array);
    }
}
class Location {
    int row;
    int col;
    double maxValue;

    public Location(double[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {

                if (array[i][j] > maxValue) {
                    maxValue = array[i][j];
                    row = i;
                    col = j;
                }
            }
        }
    }
    public int getRow() {
        return this.row;
    }

    public int getCol() {
        return this.col;
    }

    public double getMaxValue() {
        return this.maxValue;
    }
}
