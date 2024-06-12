package gr.aueb.cf.ch16;

public class Dog implements ISpeakable {
    private String name;

    private Double age;

    public Dog() {

    }

    public Dog(String name, Double age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAge() {
        return age;
    }

    public void setAge(Double age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void speak() {
        System.out.println(name + " says hello");
    }
}
