package gr.aueb.cf.ch21;

import javax.swing.*;

public class HelloSwing {

    public static void main(String[] args) {
        JFrame helloFrame = new JFrame("Hello Coding Factory");

        helloFrame.setSize(400, 200);
        helloFrame.setLocationRelativeTo(null);
        helloFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel contentPane = new JPanel();
        JLabel helloLabel = new JLabel("Hello World");
        contentPane.add(helloLabel);

        helloFrame.setContentPane(contentPane);
        helloFrame.setVisible(true);
    }
}
