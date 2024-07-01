package gr.aueb.cf.ch19;

public class GenericMain {

    public static void main(String[] args) {
        var intNode = new GenericNode<Integer>();
        GenericNode<String> strNode = new GenericNode<>();

        intNode.setItem(1);
        strNode.setItem("Hello");

     //   int data = (int) strNode.getItem();

        System.out.println(intNode);
        System.out.println(strNode);
    }
}
