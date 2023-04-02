package Week5;

import java.util.Random;
import java.util.Scanner;

public class EXC1 {
    static int[][] matrix = new int[5][5];

    public static void main(String[] args) {
     eightThreePointTwo();
    }

    // 8.3--> 1 Initializing arrays with input values.
    // The following loop initializes the array with user input values
    public static void one() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter %d rows and %d columns\n", matrix.length, matrix[0].length);
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = scanner.nextInt();
            }
        }
    }

    // 8.3--> 2 Initializing arrays with random values.
    // The following loop initializes the array with random values between 0 and 99
    public static void two() {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = (int) (Math.random() * 100);
            }
        }
    }

    // 8.3--> 3 Printing arrays. To print a two-dimensional array,
    // you have to print each element in the array using a loop like the following loop:
    public static void three() {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // 8.3--> 4 Summing all elements. Use a variable named total to store the sum.
    // Initially total is Add each element in the array to total using a loop like this:
    public static void four() {
        int total = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                total += matrix[row][column];
            }
        }
        System.out.println("Sum of matrix elements: "+total);
    }

    // 8.3--> 5 Summing elements by column. For each column, use a variable named total to store its sum.
    // Add each element in the column to total using a loop like this:
    public static void five() {
        for (int column = 0; column < matrix[0].length; column++) {
            int total = 0;
            for (int row = 0; row < matrix.length; row++)
                total += matrix[row][column];
            System.out.printf("Sum for column %d is %d\n", column, total);
        }
    }

    // 8.3--> 6 Which row has the largest sum? Use variables maxRow and indexOfMaxRow to track
    //the largest sum and index of the row. For each row, compute its sum and update maxRow
    //and indexOfMaxRow if the new sum is greater
    public static void six() {
        int maxRow = 0;
        int indexOfMaxRow = 0;
        // Get sum of the first row in maxRow
        for (int column = 0; column < matrix[0].length; column++) {
            maxRow += matrix[0][column];
        }
        for (int row = 1; row < matrix.length; row++) {
            int totalOfThisRow = 0;
            for (int column = 0; column < matrix[row].length; column++)
                totalOfThisRow += matrix[row][column];
            if (totalOfThisRow > maxRow) {
                maxRow = totalOfThisRow;
                indexOfMaxRow = row;
            }
        }
        System.out.printf("Row %d has the maximum sum of %d \n ", indexOfMaxRow, maxRow);
    }
    // 8.3--> 7 Random shuffling. Shuffling the elements in a one-dimensional array was introduced
    //in Section 7.2.6. How do you shuffle all the elements in a two-dimensional array? To
    //accomplish this, for each element matrix[i][j], randomly generate indices i1 and
    //j1 and swap matrix[i][j] with matrix[i1][j1], as follows:

    public static void seven() {
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[0].length; j++) {

                int i1 = random.nextInt(matrix.length);
                int j1 = random.nextInt(matrix.length);
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i1][j1];
                matrix[i1][j1] = temp;
            }
        }
    }

    // 8.3.1 Show the output of the following code
    public static void eightThreePointOne() {
        int[][] array = {{1, 2}, {3, 4}, {5, 6}};
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = array[i].length - 1; j >= 0; j--) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    // 8.3.2 Show the output of the following code
    public static void eightThreePointTwo() {
        int[][] array = {{1, 2}, {3, 4}, {5, 6}};
        int sum = 0;
        for (int i = 0; i < array.length; i++)
            sum += array[i][0];
        System.out.println(sum);
    }


}
