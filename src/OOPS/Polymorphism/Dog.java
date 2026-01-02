package OOPS.Polymorphism;


/**
 * Dog class overrides the sayhi() method from Animal.
 */
public class Dog extends Animal {

    // Run-time Polymorphism: Redefining how a dog "says hi"
    @Override
    public void sayhi(){
        System.out.println("Bhau bhau");
    }

    // Specific method only available to Dog class
    public void saybye(){
        System.out.println("bhauuuuuu");
    }
}
