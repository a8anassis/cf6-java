package gr.aueb.cf.ch15.animal;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 3, "Golden Retriever");
        dog.makeSound();
        dog.searchForFood();

        doMakeSound(dog);

        System.out.println("Name: " + dog.getName()
                + ", Age: " + dog.getAge()
                + "Breed: " + dog.getBreed());
    }

    // Polymorphic
    public static void doMakeSound(Animal animal) {
        animal.makeSound();
    }
}
