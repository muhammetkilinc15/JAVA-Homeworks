package Week5;

import java.util.Scanner;

public class EXC4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of points: ");
        int numberOfPoints = scanner.nextInt();
        double[][] points = new double[numberOfPoints][2];

        System.out.print("Enter "+numberOfPoints+" points: ");
        for (int i=0;i<points.length;i++){
            points[i][0]= scanner.nextDouble();
            points[i][1]= scanner.nextDouble();
        }

        double bestDistance=Double.MAX_VALUE,distane;
        int x1=0,x2=0;
        for (int i=0;i<points.length;i++){
            for (int j=i+1;j<points.length;j++){
                distane = calculateDistance(points[i][0],points[i][1],points[j][0],points[j][1]);
                if (distane<bestDistance){
                    bestDistance=distane;
                    x1=i;
                    x2=j;
                }
            }
        }
        System.out.printf("The closes two points are (%s,%s) and (%s,%s)\n",points[x1][0],points[x1][1],points[x2][0],points[x2][1]);
    }
    public static double calculateDistance(double x1,double y1,double x2, double y2){
        return Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
    }
}
