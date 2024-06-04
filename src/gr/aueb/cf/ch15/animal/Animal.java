package gr.aueb.cf.ch15.animal;

public class Animal {
    private String name;
    private int age;

    public Animal() {

    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    public void makeSound() {
        System.out.println("Some generic animal sound");
    }

    protected void searchForFood() {
        System.out.println("Searches for food");
    }
}
