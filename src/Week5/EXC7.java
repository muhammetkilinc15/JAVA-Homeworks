package Week5;

public class EXC7 {
    /**
     * (The Fan class) Design a class named Fan to represent a fan. The class contains:
     * Three constants named SLOW, MEDIUM, and FAST with the values 1, 2, and 3
     * to denote the fan speed.
     * A private int data field named speed that specifies the speed of the fan (the
     * default is SLOW).
     * A private boolean data field named on that specifies whether the fan is on (the
     * default is false).
     * A private double data field named radius that specifies the radius of the fan
     * (the default is 5).
     * A string data field named color that specifies the color of the fan (the default
     * is blue).
     * The accessor and mutator methods for all four data fields.
     * A no-arg constructor that creates a default fan.
     * A method named toString() that returns a string description for the fan. If
     * the fan is on, the method returns the fan speed, color, and radius in one combined string.
     * If the fan is not on, the method returns the fan color and radius
     * along with the string “fan is off” in one combined string.
     * <p>
     * Draw the UML diagram for the class then implement the class. Write a test program
     * that creates two Fan objects. Assign maximum speed, radius 10, color yellow,
     * and turn it on to the first object. Assign medium speed, radius 5, color blue, and
     * turn it off to the second object. Display the objects by invoking their toString
     * method.
     */
    public static void main(String[] args) {
        final int SLOW = 1;
        final int MEDIUM = 2;
        final int FAST = 3;

        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        Fan fan3 = new Fan();
        Fan fan4= new Fan();

        fan1.setSpeed(SLOW);
        fan1.setOn(true);
        fan1.setRadius(3.12);
        System.out.println(fan1.toString());

        System.out.println("\n\n");

        fan2.setOn(true);
        fan2.setSpeed(MEDIUM);
        fan2.setRadius(12.45);
        fan2.setColor("Black");
        System.out.println(fan2.toString());

        System.out.println("\n\n");

        fan3.setOn(true);
        fan3.setSpeed(FAST);
        fan3.setRadius(7.12);
        fan3.setColor("White");
        System.out.println(fan3.toString());

        System.out.println("\n\n");

        System.out.println(fan4.toString());
    }
}
class Fan {

    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed ;
    private boolean on;
    private double radius;
    private String color;

    public Fan() {
        this.on = false; // fan is default close
        this.speed=SLOW; // The default speed of the fan is 1 , So it is slow;
        this.radius = 5; // The default radius of the fan is 5
        this.color = "Blue"; // The default color of the fan is "Blue"
    }
    public String toString() {
        System.out.println("🔁⚜ Fan Features ⚜🔁\n➖➖➖➖➖➖➖➖➖➖");
        if (isOn()) {
            String speedType = "";
            speedType = switch (getSpeed()) {
                case 1 -> "SLOW";
                case 2 -> "MEDIUM";
                case 3 -> "FAST";
                default -> "Unidentified value";
            };
            return "* Fan speed: " + speedType + "\n* Radius: " + getRadius() + "\n* Color: " + getColor();
        }
        return "* Radius: " + getRadius() + "\n* Color: " + getColor() + "\n--> Fan is Off ❗❗ ";
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return this.on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
