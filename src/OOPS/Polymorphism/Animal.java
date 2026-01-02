package OOPS.Polymorphism;

/**
 * Polymorphism means "many forms".
 * In Java, it allows us to perform a single action in different ways.
 */
public class Animal {

    private String name;
    private int age;

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

    public void animaleats(){
        System.out.println("This animal eats food");
    }

    /**
     * This method will be overridden by Dog and Cat classes.
     * Each animal will "say hi" in its own way.
     */
    public void sayhi(){
        System.out.println("....");
    }
}
