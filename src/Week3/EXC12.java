package Week3;

public class EXC12 {
    public static void main(String[] args) {

        for (int i=1;i<10000;i++){
            if (isPergect(i)){
                System.out.println(i);
            }
        }
    }
    private static boolean isPergect(int number) {
        int result = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                result += i;
            }
        }
        if (result == number)
            return true;
        return false;
    }
}
