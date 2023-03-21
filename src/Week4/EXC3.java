package Week4;

public class EXC3 {
    /** Twin primes are a pair of prime numbers that differ by 2. For example, 3 and 5 are twin primes, 5
     and 7 are twin primes, and 11 and 13 are twin primes. Write a program to find all twin primes less
     than 1,200. Display the output as follows:
     (3,5)
     (11,13)
     (17,19)
     ...

     */
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
        if (number<2)
            return false;
        for (int i=2;i<10;i++){
            if (number%i==0){
                return false;
            }
        }
        return true;
    }
}
