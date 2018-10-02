package hometask1;

public class Elephant {
    private String name;
    private int mass;
    private int age;

    public Elephant() {
        this.mass = 0;
        this.age = 0;
        this.name = "";
    }
    public Elephant(String name, int mass, int age) {
        this.mass = mass;
        this.name = name;
        this.age = age;
        System.out.println("Elephant " + this.name + " with mass " + this.mass + " with age " + this.age + " has created");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMass() {
        return mass;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void eat() {
        this.mass++;
        System.out.println("Elephant ate");
    }

    public void printElephant() {
        System.out.println("Elephant " + this.name + " with mass " + this.mass + ", " + this.age + " years old");
    }
}