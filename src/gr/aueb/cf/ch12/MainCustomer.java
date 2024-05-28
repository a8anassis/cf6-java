package gr.aueb.cf.ch12;

import gr.aueb.cf.ch12.model.Customer;

public class MainCustomer {

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setId(1);
        customer.setVatRegistrationNo("123456789");

        Customer anna = new Customer(2, "Anna", "G.", "234567890", "6999999999", "Attica",
                "Central Attica", "Athens", "Patission", "76", "10434");

        System.out.println("Customer ΑΦΜ: " + customer.getVatRegistrationNo() );
        System.out.println("Anna's Vat: " + anna.getVatRegistrationNo());
    }
}
