package Week10;

public class EXC1 {
    /** * (The Rectangle class) Following the example of the Circle class in Section 9.2,
     * design a class named Rectangle to represent a rectangle. The class contains:
     * ■ Two double data fields named width and height that specify the width and
     * height of the rectangle. The default values are 1 for both width and height.
     * ■ A no-arg constructor that creates a default rectangle.
     * ■ A constructor that creates a rectangle with the specified width and height.
     * ■ A method named getArea() that returns the area of this rectangle.
     * ■ A method named getPerimeter() that returns the perimeter.
     * Draw the UML diagram for the class and then implement the class. Write a test
     * program that creates two Rectangle objects—one with width 4 and height 40
     * and the other with width 3.5 and height 35.9. Display the width, height, area,
     * and perimeter of each rectangle in this order.
     */

    public static void main(String[] args) {
        Rectange rectange1= new Rectange();
        print(rectange1.getArea(), rectange1.getPerimeter());

        Rectange rectange2 = new Rectange(4,40);
        print(rectange2.getArea(), rectange2.getPerimeter());

        Rectange rectange3= new Rectange(3.5,35.9);
        print(rectange3.getArea(), rectange3.getPerimeter());



    }
    public static void print( double area, double perimeter){
        System.out.println("Area: "+area);
        System.out.println("Perimeter: "+perimeter);
        System.out.println();
    }
}

class Rectange {

    private double width ; // Width of rectangle
    private double height; // Height of rectangle

    // A no-arg constructor that creates a default rectangle
    public Rectange() {
        this.height = 1;
        this.width = 1;
    }

    /* A constructor that creates a rectangle
     with the specified width and height  */
    public Rectange(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Return the are of this rectange
    double getArea() {
        return this.width * this.height;
    }

    // Return the perimeter of this Rectange
     double getPerimeter() {
        return 2 * (this.width + this.height);
    }
}

