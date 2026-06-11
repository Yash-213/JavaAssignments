package com.demo;

import javax.swing.*;

public class loginForm {

    // 1. Declare components as class variables (optional, but good practice)
    JFrame j;
    JLabel l, l1;
    JTextField jt;
    JPasswordField jt1;
    JButton jb, jb1;

    // 2. Create a Constructor to initialize the GUI
    public loginForm() {
        j = new JFrame("Login Form");
        j.setSize(400, 300);
        j.setLayout(null);
        j.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        l = new JLabel("Username:");
        l.setBounds(50, 50, 120, 20);

        jt = new JTextField();
        jt.setBounds(150, 50, 150, 20);

        l1 = new JLabel("Password:");
        l1.setBounds(50, 100, 120, 20);

        jt1 = new JPasswordField();
        jt1.setBounds(150, 100, 150, 20);

        jb = new JButton("Login");
        jb.setBounds(50, 160, 100, 30);

        jb1 = new JButton("Cancel");
        jb1.setBounds(200, 160, 100, 30);

        // Add components to the frame
        j.add(l);
        j.add(jt);
        j.add(l1);
        j.add(jt1);
        j.add(jb);
        j.add(jb1);

        j.setVisible(true);
    }

    // 3. Add the main method to execute the code
    public static void main(String[] args) {
        new loginForm();
    }
}