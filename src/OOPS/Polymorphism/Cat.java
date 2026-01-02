package OOPS.Polymorphism;

/**
 * Cat class also overrides the sayhi() method.
 */
public class Cat extends Animal {

    // Another form of the sayhi() action
    @Override
    public void sayhi(){
        System.out.println("Mew mew");
    }
}
