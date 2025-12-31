package OOPS.Encapsulation;
// Package name – used to group related classes together

// Class is a blueprint for creating objects.
// It defines the structure (fields) and behavior (methods) of objects.
public class Car {

    private int speed;
    // Private variable 'speed'
    // It cannot be accessed directly outside this class (Encapsulation)

    private String color;
    // Private variable 'color' to store the car's color

    public Car(String color){
        // Constructor of the Car class
        // It is called automatically when an object is created

        this.color = color;
        // 'this' refers to the current object
        // Assigns the passed color value to the object's color variable
    }

    public void setSpeed(int speed){
        // Method to set the speed of the car
        // Public → can be accessed from other classes

        if (speed < 0){
            // Checks if the given speed is negative

            System.out.println("Not Possible");
            // Prints message if speed is invalid
        } else {
            // Executes if speed is valid (0 or positive)

            this.speed = speed;
            // Assigns the value to the object's speed variable

            System.out.println("Driving at :" + speed);
            // Displays the current speed of the car
        }
    }
}
