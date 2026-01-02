package OOPS.Abstraction;

/**
 * Cat is a concrete subclass of the abstract class Animal.
 * Since it extends an abstract class, it MUST provide an implementation 
 * for all abstract methods (unless Cat itself is also abstract).
 */
public class Cat extends Animal{
    
    /**
     * Implementing the abstract method 'sayhi' from Animal.
     * This is where the specific behavior for a Cat is defined.
     */
    @Override
    public void sayhi() {
        System.out.println("Meow");
    }
}
