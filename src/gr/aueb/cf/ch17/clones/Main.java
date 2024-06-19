package gr.aueb.cf.ch17.clones;

import java.io.*;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
//        City athens = new City("Athens");
//
//        City clonedAthens = athens.clone();
//        clonedAthens.setDescription("Paris");
//
//        System.out.println(athens);
//        System.out.println(clonedAthens);

        Trainee alice = new Trainee("Alice", new City("Athens"));
//        Trainee clonedAlice = alice.clone();
//
//        clonedAlice.getCity().setDescription("London");
//
//        System.out.println(alice);
//        System.out.println(clonedAlice);

//        Trainee clonedAlice = new Trainee(alice);
//        clonedAlice.getCity().setDescription("London");
//
//        System.out.println(alice);
//        System.out.println(clonedAlice);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:/tmp/trainee.ser"))) {
            oos.writeObject(alice);
        } catch (NotSerializableException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:/tmp/trainee.ser"))) {
            Trainee aliceTrainee = (Trainee) ois.readObject();
            System.out.println(aliceTrainee);
        } catch (NotSerializableException e) {
            e.printStackTrace();
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
