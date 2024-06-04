package gr.aueb.cf.ch15.animal;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 3, "Golden Retriever");
        dog.makeSound();
        dog.searchForFood();

        System.out.println("Name: " + dog.getName()
                + ", Age: " + dog.getAge()
                + "Breed: " + dog.getBreed());
    }
}
