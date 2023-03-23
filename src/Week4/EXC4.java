package Week4;

public class EXC4 {
    /** (Emirp) An emirp (prime spelled backward) is a nonpalindromic prime number
      whose reversal is also a prime. For example, 17 is a prime and 71 is a prime, so
      17 and 71 are emirps. Write a program that displays the first 120 emirps. Display
      10 numbers per line, separated by exactly one space, as follows:
      13 17 31 37 71 73 79 97 107 113
      149 157 167 179 199 311 337 347 359 389
     */
    public static void main(String[] args) {

        for (int i = 10,j=0; j <= 120; i++) {
            if (isPrime(i) && isPrime(reversePrimeNumber(i)) && isPolindrome(i, reversePrimeNumber(i))) {
                System.out.print(i+" ");
                j++;
                if (j%10==0){
                    System.out.println();
                }
            }
        }
    }

    // This method checks whether the entered number is prime or not.
    public static boolean isPrime(int number) {

        for (int i = 2; i < 10; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    // This method returns the inverse of the prime number entered
    public static int reversePrimeNumber(int number) {
        String reverseNumber = "";
        while (number != 0) {
            reverseNumber += number % 10;
            number /= 10;
        }
        return Integer.parseInt(reverseNumber);
    }

    // This method checks if the numbers are the same
    public static boolean isPolindrome(int number, int reverse) {
        return !(number == reverse);
    }
}
