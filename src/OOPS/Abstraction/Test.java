package OOPS.Abstraction;

public class Test {
    public static void main(String[] args) {
        // We cannot create an object of an abstract class:
        // Animal animal = new Animal(); // This would cause a compilation error

        // We create an object of the concrete subclass Dog
        Dog dog = new Dog();
        
        // Calling the implemented method
        dog.sayhi();

        // Calling the inherited non-abstract method
        dog.sleep();

        // We can also use polymorphism: 
        // A variable of type Animal can hold a Cat object
        Animal myCat = new Cat();
        myCat.sayhi();
        myCat.sleep();
    }
}
