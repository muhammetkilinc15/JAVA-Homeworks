package Week2;

import java.util.Scanner;

public class EXC2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Cramer’s rule: ax + by = 44.5  x = (ed-bf)/(ad-bc)
        //                cx + dy = f     y = (af-ec)/(ad-bc)

        double a ,b,e,c,d,f;
        System.out.println("ax + by = e \ncx + dy = f");
        System.out.println("Enter a,b,e,c,d,f: ");
        a=scanner.nextDouble();
        b=scanner.nextDouble();
        e=scanner.nextDouble();
        c=scanner.nextDouble();
        d=scanner.nextDouble();
        f=scanner.nextDouble();
        System.out.println(a+"x "+b+" y = "+e);
        System.out.println(c+"x "+d+" y = "+f);
        double x = (e*d - b*f )/(a*d-b*c);
        double y= (a*f-e*c)/(a*d-b*c);
        System.out.println("x: "+x+"\ny: "+y);
    }
}
