package OOPS.Abstraction;

/**
 * Abstraction in Java is a process of hiding the implementation details 
 * and showing only functionality to the user.
 * 
 * An abstract class is a class that is declared abstract—it may or may 
 * not include abstract methods. Abstract classes cannot be instantiated, 
 * but they can be subclassed.
 */
public abstract class Animal {

    /**
     * Abstract method: This method has no body and must be implemented 
     * by any subclass that inherits from Animal.
     */
    public abstract void sayhi();

    /**
     * Regular method: Abstract classes can also have non-abstract 
     * (implemented) methods that provide common functionality.
     */
    public void sleep(){
        System.out.println("Zzz....");
    }
}
