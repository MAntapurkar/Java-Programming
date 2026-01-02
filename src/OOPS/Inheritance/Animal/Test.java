package OOPS.Inheritance.Animal;

public class Test {
    public static void main(String[] args) {

        // Creating an instance of the child class
        Dog dog = new Dog();

        // setAge() and setName() are not defined in Dog class,
        // but Dog can use them because it inherits from Animal.
        dog.setAge(22);
        dog.setName("Tiger");

        // eat() is inherited from Animal
        dog.eat();

        // sayHello() is the overridden version from Dog class
        dog.sayHello();
    }
}
