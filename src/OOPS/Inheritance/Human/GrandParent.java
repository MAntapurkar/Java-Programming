package OOPS.Inheritance.Human;

/**
 * GrandParent class is the top-most class in this hierarchy.
 * It demonstrates the beginning of Multilevel Inheritance.
 */
public class GrandParent {

    // Inheritable properties
    private String name;
    private int age;
    public boolean hasSuperpowers;

    // Getters and Setters that will be available to all descendants
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean hasSuperpowers() {
        return hasSuperpowers;
    }

    /**
     * Default constructor. 
     * When a Child object is created, this constructor will be 
     * called first in the inheritance chain.
     */
    public GrandParent(){
        hasSuperpowers = true;
        System.out.println("GrandParent (Level 1) Constructor Called");
    }
}
