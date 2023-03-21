package Week4;
import java.util.Scanner;

public class EXC1 {
    /** (Financial: credit card number validation) Credit card numbers follow certain
     patterns. A credit card number must have between 13 and 16 digits. It must start
     with
     --> 4 for Visa cards
     --> 5 for Master cards
     --> 37 for American Express cards
     --> 6 for Discover cards

     >>> For example number is 4388576018402626  <<<

     * 1. Double every second digit from right to left. If doubling of a digit results in a
      two-digit number, add up the two digits to get a single-digit number.
        2 * 2 = 4
        2 * 2 = 4
        4 * 2 = 8
        1 * 2 = 2
        6 * 2 = 12 (1 + 2 = 3)
        5 * 2 = 10 (1 + 0 = 1)
        8 * 2 = 16 (1 + 6 = 7)
        4 * 2 = 8

     * 2. Now add all single-digit numbers from Step 1.
       4 + 4 + 8 + 2 + 3 + 1 + 7 + 8 = 37

     * 3. Add all digits in the odd places from right to left in the card number.
      6 + 6 + 0 + 8 + 0 + 7 + 8 + 3 = 38

     * 4. Sum the results from Step 2 and Step 3.
       37 + 38 = 75

     5. If the result from Step 4 is divisible by 10, the card number is valid; otherwise,
      it is invalid. For example, the number 4388576018402626 is invalid, but the
      number  4355084355084358 is valid
     */

    /*
     >> You can try the following sample card numbers.

      | BANK	  |    Card No
      |-----------|------------------
      | Akbank	  | 4355084355084358
      | Akbank	  | 5571135571135575
      | YapıKredi | 4506347011448053
      -------------------------------
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a credit card number as a long integer: ");
        long creditNumber = scanner.nextLong();
        if (isValid(creditNumber)) {
            System.out.println(creditNumber + " is valid");
        } else {
            System.out.println(creditNumber + " is invalid");
        }
    }
    public static boolean isValid(long number) {
        /** Cards number must hava between 13 and 16 digits */
        boolean conditionOne=(getSize(number)>=13 && getSize(number)<=16);
        /** Card's number must start with 4 , 5 ,37 or 6 */
        int[] arr = {4,5,37,6};
        boolean conditionTwo=false;
        for (int i=0;i<arr.length;i++){
            if (prefixMatched(number,arr[i])){
                conditionTwo=true;
            }
        }
        boolean conditionThree= (sumOfDoubleEvenPlace(number)+sumOfOddPlace(number))%10==0;
        return conditionOne && conditionTwo && conditionThree;
    }
    public static int sumOfDoubleEvenPlace(long number) {
        String tempNumber = number+"";
        int sum = 0;
        for (int i = getSize(number) - 2; i >= 0; i -= 2) {
            int digit = Integer.parseInt(String.valueOf(tempNumber.charAt(i)));
            sum += getDigit(digit * 2);
        }
        // System.out.println(sum);
        return sum;
    }
    public static int sumOfOddPlace(long number) {
        int sum = 0;
        String tempNumber = number + "";
        for (int i = getSize(number) - 1; i >= 0; i -= 2) {
            int digit = Integer.parseInt(String.valueOf(tempNumber.charAt(i)));
            sum += getDigit(digit );
        }
        // System.out.println(sum);
        return sum;
    }
    /** if number is double digit such as 12 , this method return 2 + 1 = 3
     * if number is single digit such as 7 , this method return 7 (So return itself)
     */
    public static int getDigit(int number) {
        if (number > 9)
            return number % 10 + (number / 10);
        return number;
    }
    /** Return true if the number d is a prefix for number
     For instances :
     number = 4388576018410707 d=4 "Cards start with 4 and d is 4. They're same So return true"
     */
    public static boolean prefixMatched(long number, int d) {
        return getPrefix(number,getSize(d))==d;
    }
    /** Return the first k number of digits from number. If the
        number of digits in number is less than k, return number.
       For example:
      Number = 4388576018410707 , k= 4 return 4 */
    public static long getPrefix(long number, int k) {
        if (getSize(number)>k){
            String tempNumber=number+"";
            return Long.parseLong(tempNumber.substring(0,k));
        }
        return number;
    }
    /**  Return the number of digits in d */
    public static int getSize(long d) {
        return String.valueOf(d).length();
    }
}
