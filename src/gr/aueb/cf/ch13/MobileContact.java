package gr.aueb.cf.ch13;

import java.util.Arrays;

public class MobileContact {

    private final static MobileContact[] contacts = new MobileContact[500];
    private static int pivot = -1;

    private String firstname;
    private String lastname;
    private String phoneNumber;

    public MobileContact() {

    }

    public MobileContact(String firstname, String lastname, String phoneNumber) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }





    // CRUD API

    public static boolean insertContact(String firstname, String lastname, String phoneNumber) {
        if (isFull(contacts)) {
            return false;
        }

        if (getIndexByPhoneNumber(phoneNumber) != -1) {
            return false;
        }

        pivot++;
        contacts[pivot].setFirstname(firstname);
        contacts[pivot].setLastname(lastname);
        contacts[pivot].setPhoneNumber(phoneNumber);
        return true;
    }

    public static boolean updateContact(String firstname, String lastname, String phoneNumber) {
        int positionToUpdate = getIndexByPhoneNumber(phoneNumber);

        if (positionToUpdate == -1) {
            return false;
        }

        contacts[positionToUpdate].setFirstname(firstname);
        contacts[positionToUpdate].setLastname(lastname);
        return true;
    }

    public static boolean deleteContact(String phoneNumber) {
        int positionToDelete = getIndexByPhoneNumber(phoneNumber);

        if (positionToDelete == -1) {
            return false;
        }

        if (positionToDelete != pivot) {
            System.arraycopy(contacts, positionToDelete + 1, contacts, positionToDelete, pivot - positionToDelete);
        }

        pivot--;
        return true;
    }

    public static MobileContact getContactByPhoneNumber(String phoneNumber) {
        int positionToReturn = getIndexByPhoneNumber(phoneNumber);
        return (positionToReturn == -1) ? null : contacts[positionToReturn];
    }

    public static MobileContact[] getAllContacts() {
        return Arrays.copyOf(contacts, pivot + 1) ;
    }

    private static boolean isFull(MobileContact[] contacts) {
        return pivot == contacts.length - 1;
    }

    private static int getIndexByPhoneNumber(String phoneNumber) {
        for (int i = 0; i <= pivot; i++) {
            if (contacts[i].getPhoneNumber().equals(phoneNumber)) {
                return i;
            }
        }
        return -1;
    }

}
