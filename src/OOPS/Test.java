package OOPS;
// Package name – groups related OOPS classes together

public class Test {
    // Test class – used to run and test the Car class

    public static void main(String[] args) {
        // Main method – program execution starts here

        Car car = new Car("Red");
        // Creates an object of Car class
        // 'car' is a reference variable
        // Constructor is called and color is set to "Red"

        car.setSpeed(-12);
        // Calls setSpeed() method with a negative value
        // This will fail the condition and print "Not Possible"

        car.setSpeed(12);
        // Calls setSpeed() method with a valid speed is updated and message is printed
    }
}
