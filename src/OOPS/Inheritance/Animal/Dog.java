package OOPS.Inheritance.Animal;

/**
 * Dog is a CHILD class (Subclass or Derived class).
 * By using 'extends Animal', Dog inherits all methods and properties from Animal.
 */
public class Dog extends Animal {

    /**
     * @Override is an annotation that tells the compiler that we are
     * redefining a method that already exists in the parent class (Animal).
     * This is called METHOD OVERRIDING (Run-time Polymorphism).
     */
    @Override
    public void sayHello() {
        System.out.println("Woof");
    }
}
