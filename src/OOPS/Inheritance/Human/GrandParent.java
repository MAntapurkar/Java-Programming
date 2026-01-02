package OOPS.Inheritance.Human;

public class GrandParent {


    private String name;
    private int age;
    public boolean hasSuperpowers;

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




    public GrandParent(){
        hasSuperpowers = true;
        System.out.println("Gp Called");
    }
}
