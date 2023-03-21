package Week4;

public class EXC3 {
    public static void main(String[] args) {
        System.out.println("Twin primes: ");
        for (int i=2;i<1200;i++){
            if (isPrime(i-2) && isPrime(i)){
                System.out.println("("+(i-2)+", "+(i)+")");
            }
        }
    }

    // This method checks if a number is prime
    public static boolean isPrime(int number){
        for (int i=2;i<10;i++){
            if (number%i==0){
                return false;
            }
        }
        return true;
    }
}
