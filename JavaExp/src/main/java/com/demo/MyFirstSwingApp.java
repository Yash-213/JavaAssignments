package com.demo;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import java.awt.FlowLayout;

public class MyFirstSwingApp {

    public static void main(String[] args) {
        // Swing apps should run on their own special thread
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    private static void createAndShowGUI() {
        // 1. Create the Window (JFrame)
        JFrame frame = new JFrame("My First Swing App");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Stops program when window closes
        frame.setLayout(new FlowLayout()); // Simple layout to arrange items

        // 2. Create Components
        JLabel label = new JLabel("Welcome to Desktop Development!");
        JButton button = new JButton("Click Me!");

        // 3. Add Action to the Button
        button.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "You clicked the button!\nYour Java setup is perfect.");
        });

        // 4. Add Components to the Window
        frame.add(label);
        frame.add(button);

        // 5. Center the window on screen and make it visible
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}