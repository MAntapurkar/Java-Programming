package OOPS.Polymorphism;

public class Test {
    public static void main(String[] args) {

        // Normal Object creation: Animal reference, Animal object
        Animal myani = new Animal();
        myani.sayhi(); // Calls Animal's sayhi()

        // Normal Object creation: Dog reference, Dog object
        Dog dodo = new Dog();
        dodo.sayhi();  // Calls Dog's overridden sayhi()
        dodo.saybye(); // Calls Dog's specific method

        // Normal Object creation: Cat reference, Cat object
        Cat kitty = new Cat();
        kitty.sayhi(); // Calls Cat's overridden sayhi()

        /**
         * UPCASTING (Dynamic Method Dispatch / Run-time Polymorphism)
         * Here, the Parent reference (Animal) points to a Child object (Dog).
         */
        Animal dogo = new Dog();
        
        // At runtime, Java JVM identifies that 'dogo' is actually a Dog object,
        // so it calls the Dog's version of sayhi().
        dogo.sayhi(); 

        /**
         * LIMITATION OF UPCASTING:
         * We cannot call methods that are ONLY present in the Child class 
         * using a Parent reference.
         * 
         * dogo.saybye(); // This would cause a COMPILE ERROR
         */

        // Upcasting with Cat
        Animal catu = new Cat();
        catu.sayhi(); // Calls Cat's version
    }
}
