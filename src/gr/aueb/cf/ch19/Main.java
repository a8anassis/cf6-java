package gr.aueb.cf.ch19;

public class Main {

    public static void main(String[] args) {
        FlexibleNode flexibleNode = new FlexibleNode();
        flexibleNode.setItem("Coding Factory");
        int data = (int) flexibleNode.getItem();

        System.out.println(data);
    }
}
