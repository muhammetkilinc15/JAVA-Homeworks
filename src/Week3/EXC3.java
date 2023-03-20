package Week3;

import java.util.Scanner;

public class EXC3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a hex digit: ");
        String hexDigit = scanner.nextLine();
        System.out.println("Result: " + hexadicamalToBinary(hexDigit));
    }

    private static String hexadicamalToBinary(String hexDigit) {
        String answer = "";
        for (int i = 0; i < hexDigit.length(); i++) {
            if (hexDigit.charAt(i) == 'A') {
                answer += "1010";
            } else if (hexDigit.charAt(i) == 'B') {
                answer +="1011";
            } else if (hexDigit.charAt(i) == 'C') {
                answer +="1100";
            } else if (hexDigit.charAt(i) == 'D') {
                answer +="1101";
            } else if (hexDigit.charAt(i) == 'E') {
                answer += "1110";
            } else if (hexDigit.charAt(i) == 'F') {
                answer += "1111";
            } else {
                if (hexDigit.charAt(i)=='1'){
                    answer+="0000";
                } else if (hexDigit.charAt(i)=='2') {
                    answer+="0001";
                } else if (hexDigit.charAt(i)=='3') {
                    answer+="0010";
                } else if (hexDigit.charAt(i)=='4') {
                    answer+="0011";
                }else if (hexDigit.charAt(i)=='5'){
                    answer+="0101";
                } else if (hexDigit.charAt(i)=='6') {
                    answer += "0110";
                }else if (hexDigit.charAt(i)=='7') {
                    answer += "0111";
                }
                else if (hexDigit.charAt(i)=='8') {
                    answer += "1000";
                }
                else  {
                    answer += "1001";
                }
            }
            answer+=" ";
        }
        return answer;
    }

}
