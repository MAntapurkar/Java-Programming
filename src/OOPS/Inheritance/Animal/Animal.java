package OOPS.Inheritance.Animal;

/**
 * Animal class serves as the Base Class (Parent Class or Superclass).
 * It contains common properties and behaviors that can be inherited by other animal types.
 */
public class Animal {
    // These are private properties, demonstrating Encapsulation within the Parent class.
    private String name;
    private int age;

    // Getter for the name property
    public String getName() {
        return name;
    }

    // Setter for the name property
    public void setName(String name) {
        this.name = name;
    }

    // Getter for the age property
    public int getAge() {
        return age;
    }

    // Setter for the age property
    public void setAge(int age) {
        this.age = age;
    }

    // A generic behavior (method) which can be inherited by child classes.
    public void eat(){
        System.out.println("This animal eats food");
    }

    /**
     * This method is intended to be overridden by child classes 
     * to provide specific "hello" sounds (e.g., Woof, Meow).
     */
    public void sayHello(){
        System.out.println("Hello from an animal");
    }
}
