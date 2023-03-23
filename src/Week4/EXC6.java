package Week4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class EXC6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter list1 size and contents: ");
        int[] list1 = new int[scanner.nextInt()];
        for (int i = 0; i < list1.length; i++) {
            list1[i] = scanner.nextInt();
        }

        System.out.print("Enter list2 size and contents: ");
        int[] list2 = new int[scanner.nextInt()];
        for (int i = 0; i < list2.length; i++) {
            list2[i] = scanner.nextInt();
        }

        int[] merge = merge(list1, list2);

        printArray(list1, "list1");
        printArray(list2, "list2");
        printArray(merge, "The merge list ");

    }
    // I created this method to short the array
    public static int[] shortArray(int[] array) {

        // Selection Short Algorthm
        for (int i=0;i<array.length;i++){
            int min=i;
            for (int j=i+1;j<array.length;j++){
                if (array[j]<array[min]){
                    min=j;
                }
            }
            int temp=array[i];
            array[i]=array[min];
            array[min]=temp;
        }
        return array;
    }
    public static int[] merge(int[] list1, int[] list2) {
        int[] shortedLists = new int[list1.length + list2.length];

        for (int i = 0; i < list1.length; i++) {
            shortedLists[i] = list1[i];
        }

        for (int i = list1.length, j = 0; j < list2.length; j++, i++) {
            shortedLists[i] = list2[j];
        }

        shortArray(shortedLists);
        return shortedLists;
    }

    public static void printArray(int[] array, String a) {
        System.out.print(a + " is ");
        for (int b : array) {
            System.out.print(b + " ");
        }
        System.out.println();
    }
}
