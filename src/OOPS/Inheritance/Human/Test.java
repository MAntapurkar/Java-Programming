package OOPS.Inheritance.Human;


public class Test {
    public static void main(String[] args) {

        // Creating an instance of Child
        // This will trigger constructors in order: GrandParent -> Parent -> Child
        Child child = new Child();

        // setAge() is defined in GrandParent, but reachable through Multilevel Inheritance
        child.setAge(11);
        
        System.out.println("Child's age is set to: " + child.getAge());
        System.out.println("Does child have superpowers? " + child.hasSuperpowers);
    }
}
