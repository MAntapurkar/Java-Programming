package OOPS.Abstraction;

/**
 * Dog is another concrete subclass of Animal.
 * It provides its own implementation of the 'sayhi' method.
 */
public class Dog extends Animal {

    /**
     * Implementing the abstract method 'sayhi' for Dog.
     */
    @Override
    public void sayhi() {
        System.out.println("Woof");
    }
}
