package Week5;

import java.util.Scanner;

public class EXC5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter integers: ");
        int[] list = new int[scanner.nextInt()];
        for (int i=0;i<list.length;i++){
            list[i]= scanner.nextInt();;
        }
        if(isShorted(list)){
            System.out.println("The list is sorted ascending order ");
        }else {
            System.out.println("The list is not sorted ascending order");
        }
    }
    // This method if list is sorted ascending order, return true else false
    public static  boolean isShorted(int[] list){
        for (int i=0;i<list.length;i++){
            if (list[i]>list[i+1]){
                return false;
            }
        }
        return true;
    }
}
