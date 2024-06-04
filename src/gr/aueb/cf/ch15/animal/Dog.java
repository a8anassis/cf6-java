package gr.aueb.cf.ch15.animal;

public class Dog extends Animal {
    private String breed;

    public Dog() {

    }

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Woof");
    }

    @Override
    protected void searchForFood() {
        super.searchForFood();
        System.out.println("Dog ate the food");
    }
}
