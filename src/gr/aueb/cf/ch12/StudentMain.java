package gr.aueb.cf.ch12;

import gr.aueb.cf.ch12.model.Student;

/**
 * Like a client.
 * 1. Creates an {@link Student} instance (alice)
 * 2. Invokes public methods (setters / getters)
 *
 * @author a8ana
 * @version 0.1
 */
public class StudentMain {

    public static void main(String[] args) {

        Student alice = new Student();
        Student bob = new Student(2, "Bob", "D.");

        bob.setLastname("Dylan");

        alice.setId(1);
        alice.setFirstname("Alice");
        alice.setLastname("W.");

        System.out.println("Id:" + alice.getId());
        System.out.println("Firstname: " + alice.getFirstname());
        System.out.println("Lastname: " + alice.getLastname());






        // set
        /*alice.id = 1;
        alice.firstname = "Alice";
        alice.lastname = "Wonderland";*/

        // get
        /*System.out.println("Id: " + alice.id);
        System.out.println("Firstname: " + alice.firstname);
        System.out.println("Lastname: " + alice.lastname);*/
    }
}
