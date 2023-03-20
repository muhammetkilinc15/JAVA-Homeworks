package Week2;

import java.util.Scanner;

public class EXC1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int population = 85032486; // 2023 Turkey population
        System.out.println("2023 population of Turkey: "+population);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        int birht= (year*365*24*60*60)/10;
        int death =(year*365*24*60*60)/15;
        int incomingImmigrant= (year*365*24*60)/2;
        int outgoingImmigrant = (year*365*24*60)/3;
        population= (population+birht+incomingImmigrant-death-outgoingImmigrant);
        System.out.println("Population after " + year + " years: "+population);


    }
}
